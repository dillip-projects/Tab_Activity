package com.example.tab_activity;

import android.provider.CallLog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

private int NumofTabs;

    public MyAdapter(@NonNull FragmentManager fm, int numofTabs) {
        super(fm);
        NumofTabs = numofTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ChatFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default:
                return null;
        }

    }

    //constructor
    public MyAdapter(@NonNull  FragmentManager fm) {
        super(fm);
    }



    @Override
    public int getCount() {
        return NumofTabs;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position == 0)
            title="Chats";
        else if(position == 1)
            title="Status";
        else if(position == 2)
            title="Calls";
        return title;
    }
}
