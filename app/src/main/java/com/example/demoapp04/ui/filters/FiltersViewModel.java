package com.example.demoapp04.ui.filters;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FiltersViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public FiltersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Filters");
    }

    public LiveData<String> getText() {
        return mText;
    }
}