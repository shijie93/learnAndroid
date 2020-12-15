package com.example.datasave;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;

public class MyViewModel extends AndroidViewModel {

    private final String key = "NUMBER";
    SavedStateHandle handle;


    public MyViewModel(@NonNull Application application, SavedStateHandle handle) {
        super(application);
        this.handle = handle;
        if (!handle.contains(key)) {
            load();
        }
    }

    public LiveData<Integer> getNumber() {
        return handle.getLiveData(key);
    }

    private void load() {
        SharedPreferences sp = getApplication().getSharedPreferences("save_data", Context.MODE_PRIVATE);
        handle.set(key, sp.getInt(key, 0));
    }

    private void save() {
        SharedPreferences sp = getApplication().getSharedPreferences("save_data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putInt(key, getNumber().getValue());
        editor.apply();
    }

    public void add() {
        handle.set(key, getNumber().getValue() + 1);
        save();
    }

    public void mul() {
        handle.set(key, getNumber().getValue() - 1);
        save();
    }
}
