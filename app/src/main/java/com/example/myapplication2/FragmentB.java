package com.example.myapplication2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
    private OnFragmentBListener mListener;

    public interface OnFragmentBListener {
        void onBackToFragmentA();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentBListener) {
            mListener = (OnFragmentBListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentBListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        view.findViewById(R.id.button_back_a).setOnClickListener(v -> {
            if (mListener != null) {
                mListener.onBackToFragmentA();
            }
        });
        return view;
    }
}
