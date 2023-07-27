package com.example.valleyvittles.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.valleyvittles.fragements.LoginFragment;
import com.example.valleyvittles.fragements.SignUpFragment;

public class MyFragmentAdapter extends FragmentStateAdapter {


    public MyFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Return the fragment for each tab.
        switch (position) {
            case 0:
                return new LoginFragment();
            case 1:
                return new SignUpFragment();
            // Add more cases for additional tabs if needed
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        // Return the number of tabs.
        return 2; // Example with two tabs (YourFragment1 and YourFragment2)
    }
}
