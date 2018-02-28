package com.chatting.activitys.login.model;

import com.chatting.activitys.login.loginbean.LoginBean;
import com.chatting.utils.ApplicationS;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class LoginModel {
public void getlogin(final getlogindata data, Map<String,String>map){
    ApplicationS.retrofitAPIs.login(map).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Consumer<LoginBean>() {
                @Override
                public void accept(LoginBean loginBean) throws Exception {
                    data.getData(loginBean);
                }
            });

}
public interface getlogindata{
    void getData(LoginBean loginBean);
}
}
