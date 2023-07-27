package com.example.valleyvittles.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.valleyvittles.R;
import com.example.valleyvittles.databinding.ActivityOtpBinding;

public class OtpActivity extends AppCompatActivity {


    ActivityOtpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityOtpBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");
        String number = getIntent().getStringExtra("number");
    }
}