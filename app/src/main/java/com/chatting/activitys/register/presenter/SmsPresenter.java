package com.chatting.activitys.register.presenter;

import com.chatting.activitys.register.bean.SmsBean;
import com.chatting.activitys.register.model.SmsModel;
import com.chatting.activitys.register.view.SmsView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class SmsPresenter extends IPresenter<SmsView> {

    private SmsModel model;

    public SmsPresenter(SmsView view) {
        super(view);
    }

    @Override
    protected void initModel() {
        model = new SmsModel();
    }

    public void getSmsData(String phoneNumber, int type) {
        Observable<SmsBean> sms = model.getSms(phoneNumber, type);
        sms.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SmsBean>() {
                    @Override
                    public void accept(SmsBean smsBean) throws Exception {
                        view.success(smsBean);
                    }
                });
    }
}
