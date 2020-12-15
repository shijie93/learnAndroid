package com.example.mysharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class MyData {

    public int number;
    private Context context;

    public MyData(Context context) {
        this.context = context;
    }

    public void save() {
        SharedPreferences sp = context.getSharedPreferences("my_data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putInt("NUMBER", number);
        editor.apply();
    }

    public int load() {
        SharedPreferences sp = context.getSharedPreferences("my_data", Context.MODE_PRIVATE);
        number = sp.getInt("NUMBER", 0);
        return number;

    }
}
