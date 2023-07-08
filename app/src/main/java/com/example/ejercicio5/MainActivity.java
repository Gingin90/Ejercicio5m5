package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ejercicio5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}

