package com.example.myapplication2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SecondActivity extends AppCompatActivity implements FragmentA.OnFragmentAListener, FragmentB.OnFragmentBListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (savedInstanceState == null) {
            loadFragment(new FragmentA());
        }
    }

    public void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_second, fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onOpenFragmentB() {
        loadFragment(new FragmentB());
    }

    @Override
    public void onBackToFragmentA() {
        getSupportFragmentManager().popBackStack(); // Возвращаемся к FragmentA
    }
}
