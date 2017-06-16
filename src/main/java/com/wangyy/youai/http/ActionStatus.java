package com.wangyy.youai.http;

import com.alibaba.fastjson.JSON;

public class ActionStatus {
    public static final ActionStatus OK = new ActionStatus(1000, "OK");
    public static final ActionStatus REQUEST_TYPE_ERROR = new ActionStatus(1001, "Request Type Error");
    public static final ActionStatus PARAMAS_ERROR = new ActionStatus(1002, "Parameters Error");
    public static final ActionStatus DATABASE_ERROR = new ActionStatus(1003, "Database Error");
    public static final ActionStatus NOT_LOGIN = new ActionStatus(1004, "NOT Login");
    public static final ActionStatus FORBIDDEN = new ActionStatus(1005, "Access Forbidden");
    public static final ActionStatus UNKNOWN = new ActionStatus(1006, "Unknow Error");
    public static final ActionStatus SERVER_ERROR = new ActionStatus(1007, "Server Error");
    public static final ActionStatus SERVICE_SUSPEND = new ActionStatus(1008, "Server Busy,Try Later!");
    public static final ActionStatus INVALID_PHONE_NUM = new ActionStatus(1201, "Invalid Telephone");

    private int status = -1;
    private String desc = null;



    public ActionStatus(int status, String description) {
        this.status = status;
        this.desc = description;
    }

    public String toJson(){
        return JSON.toJSONString(this);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
