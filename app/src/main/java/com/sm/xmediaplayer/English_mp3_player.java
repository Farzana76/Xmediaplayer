package com.sm.xmediaplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
//import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

//import com.github.clans.fab.FloatingActionMenu;

//import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
//import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
//import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import java.io.File;
import java.util.ArrayList;

public class English_mp3_player extends AppCompatActivity implements View.OnClickListener{
       static MediaPlayer mp;
    ArrayList<File> mysongs;

    SeekBar sb;
   // Button btplay,btnext,btprev,btff,btfb;
    int position;
    Uri u;
    Thread updateSeekBar;

    // FloatingActionMenu mplayer;
    FloatingActionButton fB1, fB2, fB3, fB4, fB5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_mp3_player);

       /* ImageView imageView=new ImageView(this);
        imageView.setImageResource(R.drawable.ic_launcher);

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(imageView)
                .build();

        ImageView play= new ImageView(this);
        play.setImageResource(R.drawable.play);
        ImageView ff= new ImageView(this);
        ff.setImageResource(R.drawable.ff);
        ImageView fb= new ImageView(this);
        fb.setImageResource(R.drawable.fb);
        ImageView next= new ImageView(this);
        next.setImageResource(R.drawable.next);
        ImageView prev= new ImageView(this);
        prev.setImageResource(R.drawable.prev);

        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
        SubActionButton buttonPlay = itemBuilder.setContentView(play).build();
        SubActionButton buttonff = itemBuilder.setContentView(ff).build();
        SubActionButton buttonfb = itemBuilder.setContentView(fb).build();
        SubActionButton buttonNext = itemBuilder.setContentView(next).build();
        SubActionButton buttonPrev = itemBuilder.setContentView(prev).build();

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(buttonPlay)
                .addSubActionView(buttonff)
                .addSubActionView(buttonfb)
                .addSubActionView(buttonNext)
                .addSubActionView(buttonPrev)
                .attachTo(actionButton)
                .build();*/

        /*btplay = (Button) findViewById(R.id.btplay);
        btff = (Button) findViewById(R.id.btff);
        btfb = (Button) findViewById(R.id.btfb);
        btnext = (Button) findViewById(R.id.btnext);
        btprev = (Button) findViewById(R.id.btprev);*/

       // mplayer = (FloatingActionMenu) findViewById(R.id.social_floating_menu);
        fB1 = (FloatingActionButton) findViewById(R.id.btplay);
        fB2 = (FloatingActionButton) findViewById(R.id.btff);
        fB3 = (FloatingActionButton) findViewById(R.id.btfb);
        fB4 = (FloatingActionButton) findViewById(R.id.btnext);
        fB5 = (FloatingActionButton) findViewById(R.id.btprev);

       /*btplay.setOnClickListener(this);
        btff.setOnClickListener(this);
        btfb.setOnClickListener(this);
        btnext.setOnClickListener(this);
        btprev.setOnClickListener(this);*/

        fB1.setOnClickListener(this);
        fB2.setOnClickListener(this);
        fB3.setOnClickListener(this);
        fB4.setOnClickListener(this);
        fB5.setOnClickListener(this);

        sb = (SeekBar) findViewById(R.id.seekBar);
        updateSeekBar = new Thread()
        {
            @Override
            public void run ()
            {

                int totalDuration = mp.getDuration();
                int currentposition = 0;

                while (currentposition < totalDuration) {
                    try {
                        sleep(500);
                        currentposition = mp.getCurrentPosition();
                        sb.setProgress(currentposition);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        if (mp != null) {
            mp.stop();
            mp.release();
        }

        Intent i = getIntent();
        Bundle b = i.getExtras();
        mysongs = (ArrayList) b.getParcelableArrayList("songlist");
        position = b.getInt("pos", 0);

        u = Uri.parse(mysongs.get(position).toString());
        mp = MediaPlayer.create(getApplicationContext(), u);
        mp.start();
        sb.setMax(mp.getDuration());
        updateSeekBar.start();

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                mp.seekTo(seekBar.getProgress());
            }
        });
    }



    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btplay:
                if(mp.isPlaying())
                {
                   // btplay.setText(">");
                    mp.pause();
                }
                else{
                   // btplay.setText("| |");
                    mp.start();

                }
                break;
            case R.id.btff:
                mp.seekTo(mp.getCurrentPosition()+5000);
                break;
            case R.id.btfb:
                mp.seekTo(mp.getCurrentPosition()-5000);
                break;
            case R.id.btnext:
                mp.stop();
                mp.release();
                position=(position+1)%mysongs.size();
                u=Uri.parse(mysongs.get(position).toString());
                mp=MediaPlayer.create(getApplicationContext(),u);
                mp.start();
                sb.setMax(mp.getDuration());
                break;
            case R.id.btprev:
                mp.stop();
                mp.release();
                position=(position-1<0)? mysongs.size()-1:position-1;
                u=Uri.parse(mysongs.get(position).toString());
                mp=MediaPlayer.create(getApplicationContext(),u);
                mp.start();
                sb.setMax(mp.getDuration());
                break;
            }


    }
}
