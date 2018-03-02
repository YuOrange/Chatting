package com.chatting.utils;

import android.os.Build;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/**
*@user
*@data 2018/1/5  14:52
*
*/

public class LoggingInterceptor implements Interceptor {
    private static final String UA = "User-Agent";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request()
                .newBuilder()
                .addHeader("ak", "1")
                .build();
        return chain.proceed(request);
    }

    /*@Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl url = request.url().newBuilder()
                .addQueryParameter("ak","111002554")
                .addQueryParameter("Content-Type","application/x-www-form-urlencoded")
                .build();

        //添加请求头
        Request builder = request.newBuilder()
                .url(url)
                .build();
        return chain.proceed(builder);
    }*/

    private String makeUA() {
        String s = Build.BRAND + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE;
        return Build.BRAND + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE;
    }
}
