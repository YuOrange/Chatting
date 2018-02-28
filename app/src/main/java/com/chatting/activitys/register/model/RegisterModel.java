package com.chatting.activitys.register.model;

import com.chatting.activitys.register.bean.RegisterBean;
import com.chatting.utils.ApplicationS;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class RegisterModel {
    public Observable<RegisterBean> getMdata(String phoneNumber, String password, String password1, String realName, String verify) {
        Observable<RegisterBean> register = ApplicationS.retrofitAPIs.register(phoneNumber, password, password1, realName, verify);
        return register;
    }
}
