package com.chatting.activitys.register.presenter;

import com.chatting.activitys.register.model.RegisterModel;
import com.chatting.activitys.register.view.RegisterView;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class RegisterPresenter extends IPresenter<RegisterView> {

    private RegisterModel model;

    public RegisterPresenter(RegisterView view) {
        super(view);
    }

    @Override
    protected void initModel() {
        model = new RegisterModel();
    }
    public void getPdata(){

    }
}
