package com.sm.xmediaplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bangla_movie_review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangla_movie_review);
    }

    public void review(View view)
    {
        Intent revi=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.imdb.com/"));
        startActivity(revi);
    }
}
