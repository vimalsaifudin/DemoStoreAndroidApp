package com.example.demoapp04.ui.productdetails;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demoapp04.R;
import com.example.demoapp04.ui.filters.FiltersViewModel;

public class ProductdetailsFragment extends Fragment {

    private ProductdetailsViewModel mViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mViewModel =
                ViewModelProviders.of(this).get(ProductdetailsViewModel.class);
        View root = inflater.inflate(R.layout.productdetails_fragment, container, false);
       /* final TextView textView = root.findViewById(R.id.text_product_details);
        mViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/



        return root;
    }



}