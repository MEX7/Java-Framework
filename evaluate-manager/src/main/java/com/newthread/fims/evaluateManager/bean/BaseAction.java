package com.newthread.fims.evaluateManager.bean;

import com.newthread.fims.evaluateManager.action.*;
import com.newthread.fims.evaluateManager.service.MonthlyReportPartTwoService;
import com.newthread.fims.evaluateManager.service.DailyReportService;
import com.newthread.fims.evaluateManager.service.MonthlyReportPartOneService;
import com.newthread.fims.evaluateManager.service.RecordTransformService;
import com.newthread.fims.evaluateManager.common.tools.StreamResolve;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**Action 基类
 * Created by liyuan on 2015/1/2.
 * Modify by MEX 2015/1/8
 */
public class BaseAction extends HttpServlet {
    private Logger LOG = LogManager.getLogger();// 实例化打印Logger 日志类

    /**
     * =============================================================================================================================
     * 重写
     * =============================================================================================================================
     */

    /**
     * 每次新建的类需要在这里进行实际实例化
     * @param object
     * @return
     */
    public BaseService getService(Object object){
        if (object instanceof RecordTransformAction) return new RecordTransformService();
        if (object instanceof A102DailyReportAction) return new DailyReportService();
        if (object instanceof A103MonthlyReportAction) return new MonthlyReportPartOneService();
        if (object instanceof A1031MonthlyReportAction) return new MonthlyReportPartOneService();
        if (object instanceof A1081MonthlyReportAction) return new MonthlyReportPartTwoService();
        if (object instanceof A1091MonthlyReportAction) return new MonthlyReportPartTwoService();
        return  null;
    }

    /**
     * =============================================================================================================================
     * 通用的 function
     * =============================================================================================================================
     */
    private String parameters;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        StreamResolve streamResolve = new StreamResolve();
        parameters = new String(streamResolve.InputStreamTOByte(req.getInputStream()), "UTF-8");
        parameters = java.net.URLDecoder.decode(parameters, "utf-8");
        try {
            if (parameters.substring(0, 4).equals("data")) {
                parameters = parameters.substring(5);
            }
        }catch(Exception e){

        }

    }

    public String getParameters(){
     return parameters;
    }
    public Logger getLOG(){
        return LOG;
    }
}
