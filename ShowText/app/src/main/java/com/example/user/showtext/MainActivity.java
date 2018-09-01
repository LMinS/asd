package com.example.user.showtext;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton raBlack;
    RadioButton raBlue;
    RadioButton raRed;
    EditText inputText;
    Button btnOk;
    TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raBlack = (RadioButton)findViewById(R.id.ra_black);
        raBlue = (RadioButton)findViewById(R.id.ra_blue);
        raRed = (RadioButton)findViewById(R.id.ra_red);
        inputText = (EditText)findViewById(R.id.input_text);
        btnOk = (Button)findViewById(R.id.btn_ok);
        txtShow = (TextView)findViewById(R.id.txt_show);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtShow.setText(inputText.getText());

                if(raBlack.isChecked()){
                    txtShow.setTextColor(Color.BLACK);
                }else if(raBlue.isChecked()){
                    txtShow.setTextColor(Color.BLUE);
                }else{
                    txtShow.setTextColor(Color.RED);
                }
            }
        });
    }
}
