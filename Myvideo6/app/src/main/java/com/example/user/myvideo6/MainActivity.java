package com.example.user.myvideo6;

import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        MediaController mediaContriller = new MediaController(this);
        mediaContriller.setAnchorView(videoView);
        videoView.setMediaController(mediaContriller);

        Uri uri=Uri.parse("android.resource://com.example.user.myvideo6/"+R.raw.street);

        videoView.setVideoURI(uri);
        videoView.start();
    }
}
