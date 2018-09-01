package com.example.user.audio_player;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

        MediaPlayer bgm=null;
        ToggleButton tbtn=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       bgm=MediaPlayer.create(this,R.raw.bgm);

        tbtn=(ToggleButton)findViewById(R.id.toggleButton1);
        tbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(tbtn.isChecked()){
            bgm.seekTo(0);
            bgm.start();
        }
        else{
            bgm.pause();
    }

        }
    @Override
    public void onPause() {
        super.onPause();

        if (bgm.isPlaying()) bgm.stop();

        bgm.release();
    }
}
