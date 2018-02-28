package com.chatting.activitys.register.view;

import com.chatting.activitys.register.bean.RegisterBean;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public interface RegisterView extends IView{
    void success(RegisterBean registerBean);
    void failed(Throwable e);
}
