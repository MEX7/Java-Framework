package com.newthread.fims.evaluateManager.bean;

import com.newthread.fims.evaluateManager.data.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/** dao 基类
 * Created by liyuan on 2015/1/2.
 * Modify by MEX 2015/1/11
 */
public class BaseDao implements IDao{

    private Logger LOG = LogManager.getLogger();// 实例化打印Logger 日志类
    public Logger getLOG(){
        return LOG;
    }
    /**
     * 根据检验记录ID获取所有的检验记录相关的检验数据 不包含 检验结果
     *
     * @param checkoutRecordSid
     * @return
     */
    @Override
    public List<TCheckoutRecordMetricMeta> getAllRecordsByRecordID(String checkoutRecordSid) {
        return null;
    }

    /**
     * 根据检验计划sid获取检验计划ID
     *
     * @param planRuleSid
     * @return
     */
    @Override
    public String getPlanIdByPlanSid(long planRuleSid) {
        return null;
    }

    /**
     * 检验计划sid获取检验表达式
     *
     * @param planRuleSid
     * @return
     */
    @Override
    public TCheckoutPlanRule getDifferenceExp(long planRuleSid) {
        return null;
    }

    /**
     * 根据记录数据sid获取记录值
     *
     * @param sid
     * @return
     */
    @Override
    public List<TCheckoutRecordMetricData> getCheckoutRecordValue(long sid) {
        return null;
    }
}

