package com.chatting.activitys.register.presenter;

import com.chatting.activitys.register.view.IView;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public abstract class IPresenter<T extends IView> {
    protected T view;
    //有参构造器
    public IPresenter(T view) {
        this.view = view;
        initModel();
    }

    protected abstract void initModel();
}
