package com.newthread.fims.evaluateManager.action;

import com.newthread.fims.evaluateManager.bean.BaseAction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** 101 到 102 的数据转换
 * @author MEX
 * @since 2015.1.8
 */
public class RecordTransformAction extends BaseAction {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        String result = getService(this).recordTransform();

        resp.getWriter().print(result);

    }
}
