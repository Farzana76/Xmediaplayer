package com.sm.xmediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 2/4/2017.
 */

public class English_language extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_language);

        init111();
    }

    public Button bangla;

    public void init111()
    {
        bangla= (Button) findViewById(R.id.bangla);

        bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b=new Intent(English_language.this,Bangla_menu.class);
                startActivity(b);

            }
        });
    }
}
