package com.example.user.test03;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class SubActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void onClick_back(View v){
        finish();
    }


}
