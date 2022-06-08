package com.cookandroid.mathcore;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class selectanssheetActivity extends AppCompatActivity {
    Button Scoring_btn;
    TextView textv, r1_btn, r2_btn, r3_btn, r4_btn;

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectanssheet);

        Scoring_btn=(Button) findViewById(R.id.Scoring_btn);
        textv=(TextView)findViewById(R.id.textv);
        r1_btn=(TextView)findViewById(R.id.r1_btn);
        r2_btn=(TextView)findViewById(R.id.r2_btn);
        r3_btn=(TextView)findViewById(R.id.r3_btn);
        r4_btn=(TextView)findViewById(R.id.r4_btn);

        Scoring_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),scoreresultActivity.class);
                startActivity(intent);
            }
        });

        r1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Mathcore 1-1",Toast.LENGTH_SHORT).show();
                textv.setText("Mathcore 1-1");
            }
        });
        r2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ssen elementry",Toast.LENGTH_SHORT).show();
                textv.setText("Ssen elementry");
            }
        });

        r3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Middle test",Toast.LENGTH_SHORT).show();
                textv.setText("Middle test");
            }
        });

        r4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"1-1 다항식의 연산",Toast.LENGTH_SHORT).show();
                textv.setText("1-1 다항식의 연산");
            }
        });









    }
}