package com.example.user.audio_recoder6;

import android.media.MediaRecorder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    MediaRecorder  rec = null;
    ToggleButton tbtn_rec = null;
    String sd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbtn_rec = (ToggleButton)findViewById(R.id.)
    }

    @Override
    public void onClick(View v) {

    }
}
