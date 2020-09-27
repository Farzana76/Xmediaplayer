package com.sm.xmediaplayer;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class Bangla_video_playlist extends AppCompatActivity {
    ListView vlv;
    String[] vids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangla_video_playlist);

        vlv = (ListView) findViewById(R.id.listvideo1);
        final ArrayList<File> myvideos = findvideos(Environment.getExternalStorageDirectory());
        vids=new String[myvideos.size()];

        for(int i=0;i<myvideos.size();i++)
        {
           // toast(myvideos.get(i).toString());
            vids[i]=myvideos.get(i).getName().toString();
        }
        ArrayAdapter<String> adapt=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,vids);
        vlv.setAdapter(adapt);
        vlv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posit, long id) {

                startActivity(new Intent(getApplicationContext(),English_mp4_player.class).putExtra("posit",posit).putExtra("videolist",myvideos));
            }

        });
    }

    private ArrayList<File> findvideos(File roots) {

        File[] file = roots.listFiles();
        ArrayList<File> vl = new ArrayList<File>();
        for (File single_file : file) {
            if (single_file.isDirectory() && !single_file.isHidden()) {

                vl.addAll(findvideos(single_file));

            } else {
                if (single_file.getName().endsWith(".mp4")) {

                    vl.add(single_file);
                }

            }

        }
        return vl;
    }

    public void toast(String text)
    {
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }
}
