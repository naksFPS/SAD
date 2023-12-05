package com.example.munchbud.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.munchbud.R;

public class HomeFragment extends Fragment {

    public View onCreate(@NonNull LayoutInflater inflater,
                         ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }
}
