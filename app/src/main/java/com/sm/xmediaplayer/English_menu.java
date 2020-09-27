package com.sm.xmediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 2/3/2017.
 */

public class English_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_menu);
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        init7();


    }


    public Button video;

    public void init1()
    {
        video= (Button) findViewById(R.id.video);

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent vid=new Intent(English_menu.this,English_subtitle.class);
                startActivity(vid);

            }
        });
    }

    public Button language;

    public void init2()
    {
        language= (Button) findViewById(R.id.language);

        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lan=new Intent(English_menu.this,English_language.class);
                startActivity(lan);

            }
        });
    }

    public Button playlist;

    public void init3()
    {
        playlist= (Button) findViewById(R.id.playlist);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pl=new Intent(English_menu.this,English_song_playlist.class);
                startActivity(pl);

            }
        });
    }

    public Button help;

    public void init4()
    {
        help= (Button) findViewById(R.id.help);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent hlp=new Intent(English_menu.this,English_help.class);
                startActivity(hlp);

            }
        });
    }

    public Button vplaylist;

    public void init5()
    {
        vplaylist= (Button) findViewById(R.id.vplaylist);

        vplaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent vp=new Intent(English_menu.this,English_video_playlist.class);
                startActivity(vp);

            }
        });
    }

    public Button rev;

    public void init6()
    {
        rev= (Button) findViewById(R.id.rev);

        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent rv=new Intent(English_menu.this,English_movie_review.class);
                startActivity(rv);

            }
        });
    }

    public Button youtube;

    public void init7()
    {
        youtube= (Button) findViewById(R.id.youtube);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent y=new Intent(English_menu.this,English_youtube.class);
                startActivity(y);

            }
        });
    }


}
