package com.cookandroid.mathcore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goto_login_btn = findViewById(R.id.goto_login_btn);

        Button goto_regist_btn = findViewById(R.id.goto_register_btn);

        goto_login_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);
                //go to login
                startActivity(myIntent);
                finish();
                //finish mainactivity
            }
        });

        goto_regist_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, RegisterActivity.class);
                //go to regist
                startActivity(myIntent);
                finish();
                //finish mainactivity
            }
        });

    }
}