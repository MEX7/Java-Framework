package com.anjibei.app.framework.uitls;

import com.google.gson.Gson;

/**
 * json 与对象互相转化工具类，利用Gson, 此处用单列模式
 * Created by liyuan on 2015/1/1.
 * Mod by MEX on 2015/3/27
 */
public class JsonUtils {
    private static Gson gson;
    private static JsonUtils jsonUtils;

    //创建私有构造函数，防止外部其他类使用
    private JsonUtils() {
        gson = new Gson();
    }

    //获取实例
    public static JsonUtils getInstance() {
        if (jsonUtils == null) {
            jsonUtils = new JsonUtils();

        }
        return jsonUtils;
    }

    // json 字符串转换成object
    public Object jsonStr2Object(String json, Class className) {
        Object object = null;
        try {
            object = gson.fromJson(json, className);
        } catch (Exception e) {
            object = null;
        }
        return object;
    }

    // object 字符串转换成json
    public String objec2JsonStr(Object object) {
        String jsonStr = null;
        try {
            jsonStr = gson.toJson(object);
        } catch (Exception e) {
            jsonStr = null;
        }
        return jsonStr;
    }

}
