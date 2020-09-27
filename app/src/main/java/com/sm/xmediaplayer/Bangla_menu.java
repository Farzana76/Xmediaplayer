package com.sm.xmediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bangla_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangla_menu);

        init11();
        init21();
        init31();
        init41();
        init51();
        init61();
        init71();
    }


    public Button video1;

    public void init11()
    {
        video1= (Button) findViewById(R.id.video1);

        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent vid1=new Intent(Bangla_menu.this,Bangla_subtitle.class);
                startActivity(vid1);

            }
        });
    }

    public Button language1;

    public void init21()
    {
        language1= (Button) findViewById(R.id.language1);

        language1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lan1=new Intent(Bangla_menu.this,Bangla_language.class);
                startActivity(lan1);

            }
        });
    }

    public Button playlist1;

    public void init31()
    {
        playlist1= (Button) findViewById(R.id.playlist1);

        playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pl1=new Intent(Bangla_menu.this,Bangla_song_playlist.class);
                startActivity(pl1);

            }
        });
    }

    public Button help1;

    public void init41()
    {
        help1= (Button) findViewById(R.id.help1);

        help1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent hlp1=new Intent(Bangla_menu.this,Bangla_help.class);
                startActivity(hlp1);

            }
        });
    }

    public Button vplaylist1;

    public void init51()
    {
        vplaylist1= (Button) findViewById(R.id.vplaylist1);

        vplaylist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent vp1=new Intent(Bangla_menu.this,Bangla_video_playlist.class);
                startActivity(vp1);

            }
        });
    }

    public Button rev1;

    public void init61()
    {
        rev1= (Button) findViewById(R.id.rev1);

        rev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent rv1=new Intent(Bangla_menu.this,Bangla_movie_review.class);
                startActivity(rv1);

            }
        });
    }

    public Button youtube;

    public void init71()
    {
        youtube= (Button) findViewById(R.id.youtube);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent y=new Intent(Bangla_menu.this,Bangla_youtube.class);
                startActivity(y);

            }
        });
    }

}
