package com.chatting.activitys.register.bean;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class SmsBean {

    /**
     * message : 发送注册码异常
     * status : 9999
     */

    private String message;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
