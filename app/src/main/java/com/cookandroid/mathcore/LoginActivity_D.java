package com.cookandroid.mathcore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity_D extends AppCompatActivity {

    private EditText login_email, login_password;
    private Button login_button, join_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_email = findViewById(R.id.login_email);
        login_password = findViewById(R.id.login_password);

        //cancle로 변경
        join_button = findViewById(R.id.join_button);
        join_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity_D.this, MainActivity.class);
                startActivity(intent);
            }
        });


        login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), String.format("환영합니다."), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity_D.this, MainMenuActivity.class);

                startActivity(intent);
                finish();
            }

        });


    }


    //안드로이드 백버튼 차단
    @Override public void onBackPressed() {
        return;
    }
}