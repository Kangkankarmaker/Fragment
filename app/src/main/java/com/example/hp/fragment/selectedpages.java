package com.example.hp.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class selectedpages extends FragmentPagerAdapter{
    private final List<Fragment> fragments=new ArrayList<>();
    private final List<String> strings=new ArrayList<>();
    public void addFragment(Fragment fragment,String data){
        fragments.add(fragment);
        strings.add(data);
    }


    public selectedpages(FragmentManager fm) {
        super(fm);
    }




    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }





    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }




    @Override
    public int getCount() {
        return fragments.size();
    }
}
