package com.example.munchbud.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.munchbud.R;

public class DailyMealFragment extends Fragment {

    public View onCreate(@NonNull LayoutInflater inflater,
                         ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        return root;
    }
}
