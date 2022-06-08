package com.cookandroid.mathcore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class scoreresultActivity extends AppCompatActivity {
    Button goback_btn;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreresult);

        goback_btn=(Button) findViewById(R.id.goback_btn);

        goback_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
