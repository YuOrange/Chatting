package com.chatting.activitys.register.model;

import com.chatting.activitys.register.bean.SmsBean;
import com.chatting.utils.API;
import com.chatting.utils.ApplicationS;
import com.chatting.utils.RetrofitAPIs;
import com.chatting.utils.RetrofitManager;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class SmsModel {
    public Observable<SmsBean> getSms(String phoneNumber, int type) {
//        Observable<SmsBean> sms = ApplicationS.retrofitAPIs.sms(phoneNumber, type);
        RetrofitAPIs retrofitAPIs = RetrofitManager.getmRetrofit().create(RetrofitAPIs.class);
        return retrofitAPIs.sms(phoneNumber, type);
    }
}
