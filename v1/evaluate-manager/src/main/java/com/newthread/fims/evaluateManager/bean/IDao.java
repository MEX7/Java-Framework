package com.newthread.fims.evaluateManager.bean;

import com.newthread.fims.evaluateManager.data.*;


import java.util.List;

/**dao 层接口
 * @author MEX
 * @since 2015.1.8
 * 通用的DAO方法
 */
public interface IDao {

    /**
     * 根据检验记录ID获取所有的检验记录相关的检验数据 不包含 检验结果
     * @return
     * @param checkoutRecordSid
     */
    List<TCheckoutRecordMetricMeta> getAllRecordsByRecordID(String checkoutRecordSid);

    /**
     * 根据检验计划sid获取检验计划ID
     * @param planRuleSid
     * @return
     */
    String getPlanIdByPlanSid(long planRuleSid);

    /**
     * 检验计划sid获取检验表达式
     * @param planRuleSid
     * @return
     */
    TCheckoutPlanRule getDifferenceExp(long planRuleSid);

    /**
     * 根据记录数据sid获取记录值
     * @param sid
     * @return
     */
    List<TCheckoutRecordMetricData> getCheckoutRecordValue(long sid);
}
