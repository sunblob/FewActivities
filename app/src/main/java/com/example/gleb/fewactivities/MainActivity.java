package com.example.gleb.fewactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    //Строка для логирования
    String LOG = "MyLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    public void onButtonOneClick(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onShowTimeClick(View view){
        startActivity(new Intent("com.example.gleb.intent.action.showtime"));
    }

    public void onShowDateClick(View view){
        startActivity(new Intent("com.example.gleb.intent.action.showdate"));
    }
}