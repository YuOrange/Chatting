package com.chatting.activitys.login.presenter;

import com.chatting.activitys.login.loginbean.LoginBean;
import com.chatting.activitys.login.model.LoginModel;
import com.chatting.activitys.login.view.LoginView;

import java.util.Map;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class LoginPresenter {
    private LoginView loginView;
    private LoginModel model;
    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        this.model=new LoginModel();
    }
    public void presen(Map<String,String>map){
        model.getlogin(new LoginModel.getlogindata() {
            @Override
            public void getData(LoginBean loginBean) {
                loginView.getlogin(loginBean);
            }
        },map);
    }
}
