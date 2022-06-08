package com.cookandroid.mathcore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class selectanssheetActivity extends AppCompatActivity {
    Button Scoring_btn;
    RadioButton r1_btn, r2_btn, r3_btn;
    RadioGroup radioG;

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectanssheet);

        Scoring_btn=(Button) findViewById(R.id.Scoring_btn);
        radioG=(RadioGroup) findViewById(R.id.radioG);

        Scoring_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),scoreresultActivity.class);
                startActivity(intent);
            }
        });
        radioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.r1_btn:
                        Toast.makeText(getApplicationContext(),"Math note 1-1",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.r2_btn:
                        Toast.makeText(getApplicationContext(), "Ssen elementry", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.r3_btn:
                        Toast.makeText(getApplicationContext(),"Middle test",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.r4_btn:
                        Toast.makeText(getApplicationContext(),"1-1 다항식의 연산",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


    }
}