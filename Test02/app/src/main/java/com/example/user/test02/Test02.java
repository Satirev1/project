package com.example.user.test02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Test02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test02);
    }

   public void onClick01(View v){
       Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
       startActivity(intent);
   }

   public void onClick02(View v){
       Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다.", Toast.LENGTH_LONG).show();
   }

   public void onClick03(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
        startActivity(intent);
   }
}
