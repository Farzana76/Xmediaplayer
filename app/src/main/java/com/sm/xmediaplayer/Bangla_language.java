package com.sm.xmediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bangla_language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangla_language);
        init12();
    }

    public Button english;

    public void init12()
    {
        english= (Button) findViewById(R.id.english);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent e=new Intent(Bangla_language.this,English_menu.class);
                startActivity(e);

            }
        });
    }
}
