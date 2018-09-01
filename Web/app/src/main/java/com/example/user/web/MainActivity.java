package com.example.user.web;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void naver(View v){
        startWeb("http://www.naver.com");
    }
    public void daum(View v){
        startWeb("http://www.daum.net");
    }
    public void gms(View v){
        startWeb("http://www.gms.hs.kr");
    }
    public void google(View v){
        startWeb("http://www.google.com");
    }
    public void startWeb(String strUri){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(strUri)));
    }
}
