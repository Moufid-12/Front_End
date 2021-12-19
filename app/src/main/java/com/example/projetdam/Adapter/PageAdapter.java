package com.example.projetdam.Adapter;

import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.projetdam.Fragment.AllFragment;
import com.example.projetdam.Fragment.CategoryFragment;
import com.example.projetdam.Fragment.NewFragment;

public class PageAdapter extends FragmentStateAdapter {


    public PageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
               return new NewFragment();
            case 2:
               return new CategoryFragment();

        }
        return new AllFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }

}
