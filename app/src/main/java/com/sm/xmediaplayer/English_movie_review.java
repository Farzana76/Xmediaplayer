package com.sm.xmediaplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class English_movie_review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_movie_review);
    }

    public void review(View view)
    {
        Intent rev=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.imdb.com/"));
        startActivity(rev);
    }
}
