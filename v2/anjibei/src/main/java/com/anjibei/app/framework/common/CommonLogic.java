package com.anjibei.app.framework.common;

import com.anjibei.app.framework.config.Config;
import com.anjibei.app.framework.config.Constant;
import com.anjibei.app.framework.uitls.MySessionContext;
import com.google.gson.Gson;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpSession;

/**
 * Created by MEX on 2015/3/30.
 */
public class CommonLogic implements iCommonLogic{


    public static boolean checkSession(String sessionId) {

        if (Config.DEBUG == true) return true;

        HttpSession httpSession = MySessionContext.getSession(sessionId);

        Gson gson = new Gson();

        if (httpSession == null) {
            return false;
        }
        return true;
    }

    public static boolean checkSessionLogin(String sessionId) {
        HttpSession httpSession = MySessionContext.getSession(sessionId);

        if (httpSession.getAttribute("isLogin").equals("true")) {
            return true;
        }
        return false;
    }

    public static int getSessionUserSid(String sessionId) {

        try {
            HttpSession httpSession = MySessionContext.getSession(sessionId);
            return Integer.parseInt(httpSession.getAttribute("userSid").toString());
        } catch (Exception e) {
            if (Config.DEBUG == true) return 1;
            e.printStackTrace();
            return 0;
        }
    }

    public static JSONObject dataNull() {
        return jsonAssembly(Constant.SUCCESS_CODE, "获取数据空", null);
    }

    public static JSONObject fail() {
        return jsonAssembly(Constant.FORCE_LOGIN, "登录超时 请重新登录", null);
    }

    public static JSONObject jsonAssembly(String code, String message, Object contents) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", code);
        jsonObject.put("message", message);
        jsonObject.put("contents", contents);

        return jsonObject;
    }


}
