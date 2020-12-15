package com.example.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> likeNum;

    public MutableLiveData<Integer> getLikeNum() {
        if (likeNum == null) {
            likeNum = new MutableLiveData<Integer>();
            likeNum.setValue(0);
        }

        return likeNum;
    }

    public void add(){
        likeNum.setValue(likeNum.getValue() + 1);
    }

    public void sub(){
        likeNum.setValue(likeNum.getValue() - 1);
    }
}
