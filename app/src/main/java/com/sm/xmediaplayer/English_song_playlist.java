package com.sm.xmediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by User on 2/4/2017.
 */

public class English_song_playlist extends AppCompatActivity {
    ListView lv;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_song_playlist);

        lv = (ListView) findViewById(R.id.listplay);
        final ArrayList<File> mysongs = findsongs(Environment.getExternalStorageDirectory());
        items=new String[mysongs.size()];

        for(int i=0;i<mysongs.size();i++)
        {
          //  toast(mysongs.get(i).toString());
            items[i]=mysongs.get(i).getName().toString();
        }
        ArrayAdapter<String> adp=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,items);
        lv.setAdapter(adp);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                startActivity(new Intent(getApplicationContext(),English_mp3_player.class).putExtra("pos",position).putExtra("songlist",mysongs));
            }

        });

    }

    private ArrayList<File> findsongs(File root) {
        File[] files = root.listFiles();
        ArrayList<File> al = new ArrayList<File>();
        for (File singlefile : files) {
            if (singlefile.isDirectory() && !singlefile.isHidden()) {

                al.addAll(findsongs(singlefile));

            } else {
                if (singlefile.getName().endsWith(".mp3")) {

                    al.add(singlefile);
                }

            }

        }
        return al;

    }

    public void toast(String text)
    {
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }
}
