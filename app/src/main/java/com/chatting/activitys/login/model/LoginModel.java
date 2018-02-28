package com.chatting.activitys.login.model;

import com.chatting.utils.ApplicationS;

import java.util.Map;

/**
 * Created by Administrator on 2018/2/28/028.
 */

public class LoginModel {
public void getlogin(getlogindata data, Map<String,String>map){
    ApplicationS.retrofitAPIs.login(map);

}
public interface getlogindata{
    void getData();
}
}
