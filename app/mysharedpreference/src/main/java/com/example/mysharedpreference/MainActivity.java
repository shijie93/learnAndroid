package com.example.mysharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "myMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyData myData = new MyData(getApplicationContext());
//        myData.number = 1234;
//        myData.save();

        Log.d(TAG, String.valueOf(myData.load()));
    }
}
