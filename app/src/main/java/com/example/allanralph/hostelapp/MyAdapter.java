package com.example.allanralph.hostelapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ALLAN RALPH on 19-Nov-16.
 */

public class MyAdapter extends FragmentStatePagerAdapter {
    private int tabCount;

    public MyAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                pink p = new pink();
                return p;
            case 1:
                yelow feb = new yelow();
                return feb;
            default:
                return null;

                         }

                                         }

    @Override
    public int getCount() {
        return tabCount;
    }
}


