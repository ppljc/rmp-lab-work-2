package com.example.myapplication2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);

        Button buttonOpenFragmentA = view.findViewById(R.id.button_open_fragment_a);
        buttonOpenFragmentA.setOnClickListener(v -> {
            if (getActivity() instanceof SecondActivity) {
                ((SecondActivity) getActivity()).loadFragment(new FragmentA());
            }
        });

        return view;
    }
}
