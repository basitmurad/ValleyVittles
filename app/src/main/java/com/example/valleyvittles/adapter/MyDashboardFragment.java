package com.example.valleyvittles.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.valleyvittles.fragements.DryFruitsFragment;
import com.example.valleyvittles.fragements.NaturalMineralsFragment;

public class MyDashboardFragment extends FragmentStateAdapter {
    public MyDashboardFragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 0:
                return new DryFruitsFragment();
            case 1:
                return new NaturalMineralsFragment();
            default:
                return null;

        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
