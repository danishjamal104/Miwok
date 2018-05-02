package com.example.danish.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void identify(View v){
        Intent identifyIntent = new Intent(MainActivity.this, Identify.class);
        startActivity(identifyIntent);
    }

    public  void science(View v){
        Intent scienceIntent = new Intent(MainActivity.this, Science.class);
        startActivity(scienceIntent);
    }
}
