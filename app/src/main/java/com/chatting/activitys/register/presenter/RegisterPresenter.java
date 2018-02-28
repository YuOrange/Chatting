package com.chatting.activitys.register.presenter;

import com.chatting.activitys.register.bean.RegisterBean;
import com.chatting.activitys.register.model.RegisterModel;
import com.chatting.activitys.register.view.RegisterView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

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

    public void getPdata(String phoneNumber, String password, String password1, String realName, String verify) {
        Observable<RegisterBean> mdata = model.getMdata(phoneNumber, password, password1, realName, verify);
        mdata.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<RegisterBean>() {
                    @Override
                    public void accept(RegisterBean registerBean) throws Exception {
                        view.success(registerBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        view.failed(throwable);
                    }
                });
    }
}
