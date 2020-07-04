package com.example.demoapp04.ui.filters;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarFinalValueListener;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import com.crystal.crystalrangeseekbar.widgets.CrystalSeekbar;
import com.example.demoapp04.R;
import com.example.demoapp04.ui.gallery.GalleryViewModel;

import org.florescu.android.rangeseekbar.RangeSeekBar;

public class FiltersFragment extends Fragment {

    private FiltersViewModel mViewModel;

    /*public static FiltersFragment newInstance() {
        return new FiltersFragment();
    }*/
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mViewModel =
                ViewModelProviders.of(this).get(FiltersViewModel.class);
        View root = inflater.inflate(R.layout.filters_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_filters);
        mViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        final CrystalRangeSeekbar rangeSeekbar = (CrystalRangeSeekbar)root.findViewById(R.id.rangeSeekBar);
        rangeSeekbar.setMinValue(0)
                .setMaxValue(45000)
                .setMinStartValue(5000)
                .setMaxStartValue(40000)
                .apply();
        final TextView tvMin = (TextView)root.findViewById(R.id.textMin1);
        final TextView tvMax = (TextView)root.findViewById(R.id.textMax1);

        // set listener
        rangeSeekbar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                tvMin.setText("AED "+ String.valueOf(minValue));
                tvMax.setText("AED "+ String.valueOf(maxValue));
            }
        });

// set final value listener
        rangeSeekbar.setOnRangeSeekbarFinalValueListener(new OnRangeSeekbarFinalValueListener() {
            @Override
            public void finalValue(Number minValue, Number maxValue) {
                Log.d("CRS=>", String.valueOf(minValue) + " : " + String.valueOf(maxValue));
            }
        });




        /*rangeSeekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
            @Override
            public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {
                Number min_Value = bar.getSelectedMinValue();
                Number max_Value = bar.getSelectedMaxValue();

                int min = (int)min_Value;
                int max = (int)max_Value;
            }
        });*/

        return root;
    }



}