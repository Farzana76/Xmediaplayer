package com.sm.xmediaplayer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Welcome_screen extends AppCompatActivity {

    public static int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        new Handler().postDelayed(new Runnable(){
            @Override
                public void run(){
                Intent splash=new Intent(Welcome_screen.this,English_menu.class);
                startActivity(splash);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
