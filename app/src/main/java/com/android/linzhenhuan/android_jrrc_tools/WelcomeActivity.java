package com.android.linzhenhuan.android_jrrc_tools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 这是一个欢迎页面，主要用于系统安始化，功能权限检测，应用更新。
 *
 * 一。系统初始化的内容：
 * 1－检测网络功能是否有效，有没有互联网联接
 * 2－栓测手机的摄像功能是否有效，手机有没有前后摄像头
 * 3－手机的麦克风是否有权打开
 *
 * 二。在欢迎页面显示当前的版本号＼数据日期信息＼公告信息
 *
 * 三。应用版本检查更新和热更新
 */
public class WelcomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }


    private int init_function(){
        int check=0;
        //检查网络功能

        return  check;
    }
}
