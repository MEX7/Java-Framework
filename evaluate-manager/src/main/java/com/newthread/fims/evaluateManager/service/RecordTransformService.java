package com.newthread.fims.evaluateManager.service;


import com.newthread.fims.evaluateManager.bean.BaseService;
import com.newthread.fims.evaluateManager.common.Constant;
import com.newthread.fims.evaluateManager.common.tools.JsonUtils;
import com.newthread.fims.evaluateManager.dao.RecordTransformDao;
import com.newthread.fims.evaluateManager.data.*;

import java.util.List;

/**
 * 101到102转换
 * @author MEX
 * @since 2015.1.9
 */
public class RecordTransformService extends BaseService {
    /**
     * 将101的数据转换写入102
     * @return
     */

    RecordTransformDao dao = (RecordTransformDao)getDao(this);

    public String recordTransform() {

        // TODO 获取前一天的全部全部的检验记录
        List<TCheckoutRecordMetricMeta> tCheckoutRecordMetricMetas = dao.getAllDistinctRecord();

        // 拆分list对单条记录进行操作
        for (int i = 0 ; i < tCheckoutRecordMetricMetas.size() ; i++) {
            // 判断本次检验是否完成 现在就先默认都是完成的吧

            // TODO 对检验记录进行计算 并 写入数据库
            singleRecordOperation(tCheckoutRecordMetricMetas.get(i));

        }

        result.setCode(Constant.SUCCESS_CODE);
        result.setMessage("数据转换成功");
        return JsonUtils.getInstance().objecTransformJsonStr(result);
    }

    private void singleRecordOperation(TCheckoutRecordMetricMeta tCheckoutRecordMetricMeta) {

        // 抽样数量 抽样合格数量 抽样不合格数量 不良现象总计
        float sampleNumber              = 0;
        float sampleQualifiedNumber     = 0;
        float sampleUnqualifiedNumber   = 0;
        float badPhenomenonTotal        = 0;

        // 抽样合格率 抽样不合格率 抽样不合格PPM
        float sampleQualifiedRate       = 0;
        float sampleUnqualifiedRate     = 0;
        float sampleUnqualifiedRatePPM  = 0;


        // TODO 根据检验记录ID获取所有相关的检验记录 这里获取的排序是dim3的降序 至于为什么是dim3？我就不告诉你了
        List<TCheckoutRecordMetricMeta> tCheckoutRecordMetricMetas = dao.getAllRecordsByRecordID(tCheckoutRecordMetricMeta.getCheckoutRecordSid());

        sampleNumber = tCheckoutRecordMetricMetas.get(0).getSampleAmount();

        // TODO 获取检验计划id
        String planId = dao.getPlanIdByPlanSid(tCheckoutRecordMetricMetas.get(0).getPlanRuleSid());

        // TODO 根据检验计划id获取检验计划中的检验项数量 这里可以做优化

        /**
         * 这里可以把检验计划中的检验标准也获取出来然后放到数组中，提供给下面的循环使用，减少数据库读取次数
         */
        int inspectionItemNumber = dao.getInspectionItemNumber(planId);

        int inspectionItemPage      = 1;
        int inspectionItemCurrent   = 0;

        for (int i = 0; i < tCheckoutRecordMetricMetas.size(); i++)
        {
            Boolean estimateResult;

            // TODO 根据sid获取检验标准
            TCheckoutPlanRule tCheckoutPlanRule = dao.getDifferenceExp(tCheckoutRecordMetricMetas.get(i).getPlanRuleSid());

            // TODO 获取指标值
            String checkoutValue = getCheckoutValue(tCheckoutRecordMetricMetas.get(i).getDataNameSid());

            estimateResult = estimateCheckoutValue(tCheckoutPlanRule, checkoutValue);

            if (estimateResult==Boolean.FALSE){
                badPhenomenonTotal++;
                inspectionItemCurrent++;
            }

            if (i/inspectionItemNumber == inspectionItemPage)
            {
                if (inspectionItemCurrent > 0)
                {
                    sampleUnqualifiedNumber++;
                }
                inspectionItemCurrent = 0;
                inspectionItemPage++;
            }

        }

        sampleQualifiedNumber   = sampleNumber - sampleUnqualifiedNumber;
        sampleQualifiedRate     = sampleQualifiedNumber/sampleNumber;
        sampleQualifiedRate     = sampleUnqualifiedNumber/sampleNumber;

        // TODO 数据装载写入数据库 大概这里有20行 这个函数是不是超过100行了

    }

    /**
     * 获取检测值
     * @param sid
     * @return
     */
    private String getCheckoutValue(long sid)
    {
        String checkoutValue = null;

        List<TCheckoutRecordMetricData> tCheckoutRecordMetricDatas = dao.getCheckoutRecordValue(sid);

        if (!tCheckoutRecordMetricDatas.isEmpty())
        {
            checkoutValue = tCheckoutRecordMetricDatas.get(0).getsValues();
        }

        return checkoutValue;
    }

    /**
     * 返回是否合格
     */
    private boolean estimateCheckoutValue(TCheckoutPlanRule tCheckoutPlanRule, String checkoutValue)
    {
        Boolean result = Boolean.TRUE;
        /**
         * 我们这里要是求不良现象和不良品的数量
         */
        if (tCheckoutPlanRule.getCheckoutPlanTypeId()=="CPTI001"){
            // TODO 定性判断
            if (checkoutValue == "是"){
                result = true;
            }
            else{
                result = false;
            }
        }else if (tCheckoutPlanRule.getCheckoutPlanTypeId()=="CPTI002"){
            // TODO 定量判断
        }

        return result;
    }
}
