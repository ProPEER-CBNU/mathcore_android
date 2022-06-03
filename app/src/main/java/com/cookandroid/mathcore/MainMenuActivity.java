package com.cookandroid.mathcore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button goto_imageupload = findViewById(R.id.goto_imageupload);
        Button goto_selectanssheet = findViewById(R.id.goto_selectanssheet);
        Button goto_selectstudent = findViewById(R.id.goto_selectstudent);

        goto_imageupload.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){

                Intent myIntent = new Intent(MainMenuActivity.this, imageuploadActivity.class);
                //go to imageupload
                startActivity(myIntent);
            }
        });

        goto_selectanssheet.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent myIntent = new Intent(MainMenuActivity.this, selectanssheetActivity.class);
                //go to ansSheet
                startActivity(myIntent);
            }
        });
        goto_selectstudent.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent myIntent = new Intent(MainMenuActivity.this, selectStudentActivity.class);
                //go to studentlist
                startActivity(myIntent);
            }
        });

    }
}