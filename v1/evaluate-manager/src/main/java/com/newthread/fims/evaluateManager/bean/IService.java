package com.newthread.fims.evaluateManager.bean;


/**
 * service 接口类
 * Created by liyuan on 2015/1/6.
 *
 * 注意：新增接口时，需要在接口中添加对应的接口方法
 *
 * Modify by MEX 2015/1/11
 */
public interface IService {

    String recordTransform();

    String getA102DailyReport();

    String getA1031MonthlyReport();

    String getA1081MonthlyReport();

    String getA1091MonthlyReport();
}
