package com.chatting.utils;

import com.chatting.activitys.login.loginbean.LoginBean;
import com.chatting.activitys.register.bean.RegisterBean;

import com.chatting.activitys.login.loginbean.LoginBean;
import com.chatting.activitys.register.bean.SmsBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2018/1/3.
 */

public interface RetrofitAPIs {
    //登录
    @GET(API.LOGIN)
    Observable<LoginBean> login(@QueryMap Map<String, String> map);

    //注册
    @FormUrlEncoded
    @POST(API.REGISTER)
    Observable<RegisterBean> register(@Field("phoneNumber") String phoneNumber, @Field("password") String password, @Field("password1") String password1, @Field("realName") String realName, @Field("verify") String verify);

    //发送SMS短信
    @GET(API.SMS)
    Observable<SmsBean> sms(@Query("phoneNumber") String phoneNumber, @Query("type") int type);

}
