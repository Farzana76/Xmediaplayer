package com.sm.xmediaplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class English_youtube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_youtube);
    }
    public void youtube(View view)
    {
        Intent yt=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
        startActivity(yt);
    }
}
