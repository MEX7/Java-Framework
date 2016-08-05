package com.anjibei.app.framework.config;

/**
 * 全局
 * Created by liyuan on 2015/1/1.
 */
public class Constant {

    /**
     * 系统级别常量
     */
//    API调用成功，只要API调用成功不是系统异常就返回这个
    public final static String SUCCESS_CODE             = "N01";
//    在系统异常错误抛出时返回
    public final static String ERROR_CODE               = "E01";
//    强制重新登录
    public final static String FORCE_LOGIN              = "E02";

    /**
     * 数值常量
     */
//    经纬度抓取范围
    public final static double RANGE = 0.02;
//    分页大小
    public final static Integer PAGE_NUMBER = 15;
//    每天的秒数
    public final static Integer SECONDS_TO_DAYS = 86400;
//    一年的天数
    public final static Integer DAYS_TO_YEARS = 365;


}
