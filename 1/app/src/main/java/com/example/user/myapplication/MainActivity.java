package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick01(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void onClick02(View v){
        Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다.", Toast.LENGTH_LONG).show();
    }

    public void onClick03(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-2013-9050"));
        startActivity(intent);
    }
}

