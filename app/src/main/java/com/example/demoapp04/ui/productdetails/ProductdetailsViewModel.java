package com.example.demoapp04.ui.productdetails;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProductdetailsViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private MutableLiveData<String> mText;

    public ProductdetailsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Product Details");
    }

    public LiveData<String> getText() {
        return mText;
    }
}