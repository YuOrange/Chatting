package com.chatting.activitys;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.chatting.R;
import com.chatting.center.view.FragCenter;
import com.chatting.friends.view.FragFriends;
import com.chatting.message.view.FragMessage;

public class HomeActivity extends FragmentActivity {

    private FragmentManager manager;
    private RadioGroup radioGroup;
    private FragMessage fm;
    private FragFriends ff;
    private FragCenter fc;
    private RadioButton rbMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        initView();
        initData();
        //默认加载Message的试图
        getfragment(fm);
        //默认message为选中状态
        rbMessage.setChecked(true);
    }

    private void initView() {
        manager = getSupportFragmentManager();//事务管理者
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        fm = new FragMessage();
        ff = new FragFriends();
        fc = new FragCenter();
        rbMessage = findViewById(R.id.rb_message);
    }

    private void initData() {
        //radio Group的监听事件
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.rb_message:
                        getfragment(fm);
                        ff.isHidden();
                        fc.isHidden();
                        break;
                    case R.id.rb_friends:
                        getfragment(ff);
                        fm.isHidden();
                        fc.isHidden();
                        break;
                    case R.id.rb_center:
                        getfragment(fc);
                        fm.isHidden();
                        ff.isHidden();
                        break;
                }
            }
        });
    }

    //开启事务管理
    public void getfragment(Fragment fragment) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl, fragment);
        transaction.commit();
    }
}
