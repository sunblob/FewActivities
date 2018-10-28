package com.example.gleb.fewactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    String LOG = "MyLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(LOG, "OnCreate у активити");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(LOG,"OnStart у активити");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(LOG, "OnResume у активити");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(LOG,"OnPause у активити");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(LOG,"OnStop у активити");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(LOG,"OnDestroy у активити");
    }

    public void onButtonTwoClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}