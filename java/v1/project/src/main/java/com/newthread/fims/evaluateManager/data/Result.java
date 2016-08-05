package com.newthread.fims.evaluateManager.data;

/** 返回json 头部统一格式
 * Created by liyuan on 2015/1/1.
 */
public class Result {

    private String code;
    private String message;
    private Object array;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getArray() {
        return array;
    }
    public void setArray(Object array) {
        this.array = array;
    }


}
