package com.example.myapplication2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        Button buttonOpenFragmentB = view.findViewById(R.id.button_open_fragment_b);
        buttonOpenFragmentB.setOnClickListener(v -> {
            if (getActivity() instanceof SecondActivity) {
                ((SecondActivity) getActivity()).loadFragment(new FragmentB());
            }
        });

        return view;
    }
}
