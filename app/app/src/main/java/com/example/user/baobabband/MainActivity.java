package com.example.user.baobabband;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner Main_spinner = (Spinner)findViewById( R.id.spinner );

        ArrayAdapter adapter = ArrayAdapter.createFromResource( this, R.array.sort, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource( android.R.layout.simple_dropdown_item_1line);
        Main_spinner.setAdapter( adapter );

        Main_spinner.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText( getApplicationContext(), Integer.toString( position ), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        }
    }


