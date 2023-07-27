package com.example.valleyvittles.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.valleyvittles.R;
import com.example.valleyvittles.adapter.MyFragmentAdapter;

import com.example.valleyvittles.databinding.ActivitySignUpBinding;
import com.google.android.material.tabs.TabLayout;


public class SignUpActivity extends AppCompatActivity {


    ActivitySignUpBinding binding;
    private MyFragmentAdapter myFragmentAdapter;
    ViewPager2 viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewPager  = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        myFragmentAdapter = new MyFragmentAdapter(this);
        viewPager.setAdapter(myFragmentAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });



        // Set up the TabLayout with the ViewPager2 using TabLayoutMediator
//        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
//            // Set the text for each tab
//            if (position == 0) {
//
//
//            } else if (position == 1) {
//                tab.setText("Sign Up");
//            }
//        }).attach();



        // Set up the TabLayout with the ViewPager






    }
}