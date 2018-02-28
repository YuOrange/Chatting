package com.chatting.activitys.login.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.chatting.R;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class LoginActivity extends Activity {
    @BindView(R.id.edit_name)
    EditText editName;
    @BindView(R.id.edit_pass)
    EditText editPass;
    @BindView(R.id.edit_verify)
    EditText editVerify;
    @BindView(R.id.sdv_verify)
    SimpleDraweeView sdvVerify;
    @BindView(R.id.but_login)
    TextView butLogin;
    @BindView(R.id.but_register)
    TextView butRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.but_login, R.id.but_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.but_login:

                break;
            case R.id.but_register:
                break;
        }
    }
}
