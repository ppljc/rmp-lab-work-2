package com.example.myapplication2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        Button buttonBackToA = view.findViewById(R.id.button_back_to_a);
        buttonBackToA.setOnClickListener(v -> {
            if (getActivity() instanceof SecondActivity) {
                ((SecondActivity) getActivity()).loadFragment(new FragmentA());
            }
        });

        return view;
    }
}
