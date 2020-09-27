package com.sm.xmediaplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by User on 2/4/2017.
 */

public class English_subtitle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_subtitle);
    }

    public void subtitle(View view)
    {
        Intent sub=new Intent(Intent.ACTION_VIEW, Uri.parse("https://subscene.com/"));
        startActivity(sub);
    }
}
