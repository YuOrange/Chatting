package com.chatting.activitys.login.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chatting.R;
import com.chatting.activitys.login.loginbean.LoginBean;
import com.chatting.activitys.login.presenter.LoginPresenter;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class LoginActivity extends Activity implements LoginView{
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
                Map<String,String>map=new HashMap<>();
                map.put("phoneNumber",editName.getText().toString());
                map.put("password",editPass.getText().toString());
                map.put("imagevaildate",editVerify.getText().toString());
                LoginPresenter loginPresenter = new LoginPresenter(this);
                loginPresenter.presen(map);
                break;
            case R.id.but_register:
                break;
        }
    }

    @Override
    public void getlogin(LoginBean loginBean) {
        Toast.makeText(this,loginBean.getMessage(),Toast.LENGTH_SHORT).show();
    }
}
