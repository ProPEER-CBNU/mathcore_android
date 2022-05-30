package com.cookandroid.mathcore;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.io.InputStream;


public class imageuploadActivity extends AppCompatActivity {
    final private static String TAG = "mathcore";
    Button gallery_btn, camera_btn, select_btn;
    ImageView iv_photo;

    final static int TAKE_PICTURE=1;
    final static int REQUEST_CODE=0;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageupload);

        select_btn=findViewById(R.id.select_btn);
        iv_photo=findViewById(R.id.iv_photo);
        camera_btn=findViewById(R.id.camera_btn);
        gallery_btn=findViewById(R.id.gallery_btn);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED&&
                    checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED){
                Log.d(TAG,"Completion of permission setting");
            }
            else{
                Log.d(TAG,"Request to set permission");
                ActivityCompat.requestPermissions(imageuploadActivity.this,
                        new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
                }
            }
        gallery_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
        select_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),selectanssheetActivity.class);
                startActivity(intent);
            }
        });
        camera_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                switch(v.getId()){
                    case R.id.camera_btn:
                        Intent cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(cameraIntent,TAKE_PICTURE);
                        break;
                }
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode,resultCode,intent);

        switch (requestCode){
            case TAKE_PICTURE:
                if(resultCode==RESULT_OK&&intent.hasExtra("data")){
                    Bitmap bitmap=(Bitmap)intent.getExtras().get("data");
                    if(bitmap!=null){
                        iv_photo.setImageBitmap(bitmap);
                    }
                }
                break;
        }

        if(requestCode==REQUEST_CODE){
            if(resultCode==RESULT_OK){
                try{
                    InputStream in=getContentResolver().openInputStream(intent.getData());
                    Bitmap img= BitmapFactory.decodeStream(in);
                    in.close();

                    iv_photo.setImageBitmap(img);
                } catch (Exception e) {

                }
            }
            else if(resultCode==RESULT_CANCELED){
                Toast.makeText(this,"사진 선택 취소",Toast.LENGTH_LONG).show();
            }
        }
    }
}

