package com.example.myapplication2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {
    private OnFragmentAListener mListener;

    public interface OnFragmentAListener {
        void onOpenFragmentB();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentAListener) {
            mListener = (OnFragmentAListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentAListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        view.findViewById(R.id.button_open_b).setOnClickListener(v -> {
            if (mListener != null) {
                mListener.onOpenFragmentB();
            }
        });
        return view;
    }
}
