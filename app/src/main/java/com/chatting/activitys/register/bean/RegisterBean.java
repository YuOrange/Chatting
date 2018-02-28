package com.chatting.activitys.register.bean;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class RegisterBean {
    private String message;
    private String status;

    public RegisterBean(String message, String status) {
        this.message = message;
        this.status = status;
    }

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
