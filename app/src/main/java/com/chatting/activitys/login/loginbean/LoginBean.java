package com.chatting.activitys.login.loginbean;

/**
 * Created by 猥琐的熊猫 on 2018/2/28.
 */

public class LoginBean {

    /**
     * result : {"accout":"20180227155018701","password":"e10adc3949ba59abbe56e057f20f883e","sessionId":"20180228114759104","userId":104}
     * message : 登录成功
     * status : 0000
     */

    private ResultBean result;
    private String message;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
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

    public static class ResultBean {
        /**
         * accout : 20180227155018701
         * password : e10adc3949ba59abbe56e057f20f883e
         * sessionId : 20180228114759104
         * userId : 104
         */

        private String accout;
        private String password;
        private String sessionId;
        private int userId;

        public String getAccout() {
            return accout;
        }

        public void setAccout(String accout) {
            this.accout = accout;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }
}
