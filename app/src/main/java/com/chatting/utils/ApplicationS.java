package com.chatting.utils;

import android.app.Application;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
//import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * @user
 * @data 2018/1/5  19:24
 */
public class ApplicationS extends Application {
    private static ApplicationS mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Fresco包
        //Fresco.initialize(this);
        //初始化zxing包
        //ZXingLibrary.initDisplayOpinion(this);
        mInstance = this;
        boolean connected = NetUtil.isConnected(this);
        if (connected) {
            boolean available = NetUtil.isAvailable(this);
            if (available) {
                Toast.makeText(this,"网络已连接",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this,"当前网络不可用",Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this,"当前网络无法连接",Toast.LENGTH_SHORT).show();
        }

    }
}
