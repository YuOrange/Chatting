package com.chatting.activitys.register.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.chatting.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class RegisterActivity extends Activity {
    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.ed_passWord)
    EditText edPassWord;
    @BindView(R.id.ed_passWord_again)
    EditText edPassWordAgain;
    @BindView(R.id.ed_name)
    EditText edName;
    @BindView(R.id.ed_yzm)
    EditText edYzm;
    @BindView(R.id.getYZM)
    Button getYZM;
    @BindView(R.id.registerButton)
    Button registerButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        ButterKnife.bind(this);


    }
    //点击事件
    @OnClick({R.id.back, R.id.ed_phone, R.id.ed_passWord, R.id.ed_passWord_again, R.id.ed_name, R.id.ed_yzm, R.id.getYZM})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.ed_phone:
                break;
            case R.id.ed_passWord:
                break;
            case R.id.ed_passWord_again:
                break;
            case R.id.ed_name:
                break;
            case R.id.ed_yzm:
                break;
            case R.id.getYZM:
                Toast.makeText(RegisterActivity.this,"获取验证码",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    //点击注册
    @OnClick(R.id.registerButton)
    public void onViewClicked() {
        Toast.makeText(RegisterActivity.this,"点击了注册",Toast.LENGTH_SHORT).show();
    }
}
