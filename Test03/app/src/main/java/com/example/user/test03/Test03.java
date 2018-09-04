package com.example.user.test03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Test03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test03);
    }

    public void onClick01(View v){
        Intent intent_01 = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(intent_01);
    }
}
