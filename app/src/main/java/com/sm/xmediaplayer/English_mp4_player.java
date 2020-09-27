package com.sm.xmediaplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.SurfaceView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;
import java.util.ArrayList;

public class English_mp4_player extends AppCompatActivity {

    ArrayList<File> myvideos;
    int posit;
    VideoView v;
    Uri uu;
    DisplayMetrics dm;
    MediaController media_Controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_mp4_player);

         v = (VideoView) findViewById(R.id.vview);

        Intent ii = getIntent();
        Bundle bb = ii.getExtras();
        myvideos = (ArrayList) bb.getParcelableArrayList("videolist");
        posit = bb.getInt("posit", 0);

        uu = Uri.parse(myvideos.get(posit).toString());

        media_Controller = new MediaController(this);
        dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;
        v.setMinimumWidth(width);
        v.setMinimumHeight(height);
        v.setMediaController(media_Controller);
        v.setVideoPath(uu.toString());
        v.start();
    }

}


