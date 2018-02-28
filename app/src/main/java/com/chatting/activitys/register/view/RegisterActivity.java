package com.chatting.activitys.register.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chatting.R;
import com.chatting.activitys.register.bean.RegisterBean;
import com.chatting.activitys.register.presenter.RegisterPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class RegisterActivity extends Activity implements RegisterView {
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
    @BindView(R.id.registerResult)
    TextView registerResult;
    private RegisterPresenter presenter;
    private String phoneNumberStr;
    private String passWord;
    private String passwordAgain;
    private String name;
    private String verify;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        ButterKnife.bind(this);

        initView();
        initData();
    }

    private void initView() {
        presenter = new RegisterPresenter(this);
        phoneNumberStr = edPhone.getText().toString();
        passWord = edPassWord.getText().toString();
        passwordAgain = edPassWordAgain.getText().toString();
        name = edName.getText().toString();
        verify = edYzm.getText().toString();
    }

    private void initData() {
//        presenter.getPdata(phoneNumberStr, passWord, passwordAgain, name, verify);
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
                Toast.makeText(RegisterActivity.this, "获取验证码", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //点击注册
    @OnClick(R.id.registerButton)
    public void onViewClicked() {
        Toast.makeText(RegisterActivity.this, "正在注册...", Toast.LENGTH_SHORT).show();
        presenter.getPdata(phoneNumberStr, passWord, passwordAgain, name, verify);
    }

    @Override
    public void success(RegisterBean registerBean) {
        Log.e("++++++++++++++", "解析结果为：" + registerBean.getMessage());
        registerResult.setText(registerBean.getMessage());

    }

    @Override
    public void failed(Throwable e) {
//        Toast.makeText(RegisterActivity.this, "正在注册...", Toast.LENGTH_SHORT).show();
    }
}
