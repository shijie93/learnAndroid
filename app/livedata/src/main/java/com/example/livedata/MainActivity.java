package com.example.livedata;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.example.livedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MyViewModel myViewModel;
    ActivityMainBinding activityMainBinding;

    // data bind 版本
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        activityMainBinding.setData(myViewModel);
        activityMainBinding.setLifecycleOwner(this);
    }
}
