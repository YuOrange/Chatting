package com.chatting.utils;


import com.chatting.activitys.login.loginbean.LoginBean;
import com.chatting.activitys.register.bean.RegisterBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
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
    @GET(API.REGISTER)
    Observable<RegisterBean> register(@Query("phoneNumber")String phoneNumber,@Query("password")String password,@Query("password1")String password1,@Query("realName")String realName,@Query("verify")String verify);



}
