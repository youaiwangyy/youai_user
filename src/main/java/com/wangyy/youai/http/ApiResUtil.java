package com.wangyy.youai.http;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by qingjiang on 2017/6/16.
 */
public class ApiResUtil {

    public ApiResUtil() {

    }

    public static String responseFail() {
        return responseFail(ActionStatus.UNKNOWN, null);
    }

    public static String responseFail(String desc) {
        return responseFail(ActionStatus.UNKNOWN, desc);
    }

    public static String responseFail(ActionStatus status, Object data) {
        return responseFail(status, status.getDesc(), data);
    }

    public static String responseFail(String desc, Object data) {
        return responseFail(ActionStatus.UNKNOWN.getStatus(), desc, data);
    }

    public static String responseFail(ActionStatus status, String desc, Object data) {
        return responseFail(status.getStatus(), desc, data);
    }

    public static String responseFail(int status, String desc, Object data) {
        return sendResponse(status, desc, data);
    }

    public static String responseOk() {
        return responseOk(null);
    }

    public static String responseOk(Object data) {
        return responseOk(ActionStatus.OK.getDesc(), data);
    }

    public static String responseOk(String desc, Object data) {
        return sendResponse(ActionStatus.OK.getStatus(), desc, data);
    }

    public static String sendResponse(ActionStatus actionStatus, Object data) {
        return sendResponse(actionStatus.getStatus(), actionStatus.getDesc(), data);
    }

    public static String sendResponse(ActionStatus actionStatus, String desc, Object data) {
        return sendResponse(actionStatus.getStatus(), desc, data);
    }

    public static String sendResponse(int status, String msg, Object data) {
        JSONObject resp = new JSONObject();
        try {
            resp.put("status", status);
            resp.put("desc", msg);
            resp.put("data", data);
            return resp.toJSONString();
        } catch (Exception e) {
            return ActionStatus.SERVER_ERROR.toJson();
        }
    }
}
