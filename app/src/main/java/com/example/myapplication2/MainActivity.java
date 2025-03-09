package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new MyFragment())
                    .commit();
        }

        Button buttonOpenSecond = findViewById(R.id.button_open_second_activity);
        buttonOpenSecond.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}
