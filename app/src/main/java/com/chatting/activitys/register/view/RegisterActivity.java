package com.chatting.activitys.register.view;

import android.app.Activity;
import android.graphics.Color;
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
import com.chatting.activitys.register.bean.SmsBean;
import com.chatting.activitys.register.presenter.RegisterPresenter;
import com.chatting.activitys.register.presenter.SmsPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class RegisterActivity extends Activity implements RegisterView, SmsView {
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
    private RegisterPresenter registerPresenter;
    private SmsPresenter smsPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        registerPresenter = new RegisterPresenter(this);
        smsPresenter = new SmsPresenter(this);
    }

    //点击事件
    @OnClick({R.id.back, R.id.ed_phone, R.id.ed_passWord, R.id.ed_passWord_again, R.id.ed_name, R.id.ed_yzm, R.id.getYZM})
    public void onViewClicked(View view) {
        String phoneNumberStr = edPhone.getText().toString();
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.getYZM:
                if (phoneNumberStr != null) {
                    smsPresenter.getSmsData(phoneNumberStr, 1);
                    Log.e("++++++++", "phoneNumberStr:" + phoneNumberStr);
                    Toast.makeText(RegisterActivity.this, "正在发送验证码", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    //点击注册
    @OnClick(R.id.registerButton)
    public void onViewClicked() {
        String phoneNumberStr = edPhone.getText().toString();
        String passWord = edPassWord.getText().toString();
        String passwordAgain = edPassWordAgain.getText().toString();
        String name = edName.getText().toString();
        String verify = edYzm.getText().toString();
        Log.e("++++++++", "输入框内容依次是：" + phoneNumberStr + "," + passWord + "," + passwordAgain + "," + name + "," + verify);
        if (phoneNumberStr != null && passWord != null && passwordAgain != null && name != null && verify != null) {
            Toast.makeText(RegisterActivity.this, "正在注册...", Toast.LENGTH_SHORT).show();
            registerPresenter.getPdata(phoneNumberStr, passWord, passwordAgain, name, verify);
        } else {
            Toast.makeText(RegisterActivity.this, "请输入完整", Toast.LENGTH_SHORT).show();
        }
    }

    //请求成功
    @Override
    public void success(RegisterBean registerBean) {
        Log.e("++++++++++++++", "解析结果为：" + registerBean.getMessage());
        if (registerBean.getMessage().equals("注册成功")) {
            registerResult.setText(registerBean.getMessage() + "，请牢记账号密码,返回并登陆");
        }
        if (registerBean.getMessage().equals("注册失败")) {
            registerResult.setText(registerBean.getMessage() + ",不能重复注册同一手机号");
            registerResult.setTextColor(Color.RED);
        }

    }

    //请求失败
    @Override
    public void failed(Throwable e) {
        Log.e("++++++++++++++", "解析结果为：" + e.getMessage().toString());
        registerResult.setText(e.getMessage().toString());
        registerResult.setTextColor(Color.RED);
    }

    //SMS成功方法
    @Override
    public void success(SmsBean smsBean) {
        Log.e("++++++++++++++", "解析结果为：" + smsBean.getMessage());
        registerResult.setText(smsBean.getMessage());
        registerResult.setTextColor(Color.BLUE);
    }
}
