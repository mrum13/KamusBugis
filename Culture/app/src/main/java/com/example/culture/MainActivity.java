package com.example.culture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dashboard =new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(dashboard);
                finish();
            }
        },waktu_loading);
    }
}
