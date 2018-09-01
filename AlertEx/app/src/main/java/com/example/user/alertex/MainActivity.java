package com.example.user.alertex;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder art = new AlertDialog.Builder(this);
        art.setTitle("알림");
        art.setMessage("메세지를 수신하시겠습니까?");
        art.setIcon(R.mipmap.ic_launcher);

        art.setNegativeButton("거부", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "메세지 수신 거부", Toast.LENGTH_LONG).show();
            }
        });

        art.setPositiveButton("수신", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "메시지 수신 동의", Toast.LENGTH_LONG).show();
            }
        });

        art.show();
    }
}
