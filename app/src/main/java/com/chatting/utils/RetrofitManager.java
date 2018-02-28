package com.chatting.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/1/3.
 */

public class RetrofitManager {

    private static Retrofit mRetrofit;
    private static RetrofitManager mRetrofitManager;

    public RetrofitManager(String baseUrl) {
        mRetrofit = new Retrofit.Builder()
                .client(OkHttpUtils.getInstance())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseUrl)
                .build();
    }

    public static RetrofitManager getInstance(String baseUrl) {
        if (mRetrofitManager == null) {
            synchronized (RetrofitManager.class) {
                mRetrofitManager = new RetrofitManager(baseUrl);
            }
        }
        return mRetrofitManager;
    }

    public static Retrofit getmRetrofit() {
        return mRetrofit;
    }

    public <T> T create(Class<T> service) {
        return mRetrofit.create(service);
    }
}
