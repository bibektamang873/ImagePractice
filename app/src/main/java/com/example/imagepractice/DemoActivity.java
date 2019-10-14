package com.example.imagepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        Log.d("msg", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("msg", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg", "onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("msg", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("msg", "onRestart");
    }
}
