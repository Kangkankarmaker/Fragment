package com.example.hp.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private selectedpages selectedpages;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectedpages=new selectedpages(getSupportFragmentManager());
        
        viewPager =findViewById(R.id.container);
        setViewpager(viewPager);


        TabLayout tabLayout =findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }

    public void setViewpager(ViewPager viewpager) {

        selectedpages.addFragment(new BlankFragment(),"my");
        selectedpages.addFragment(new BlankFragment2(),"Name");
        selectedpages.addFragment(new BlankFragment3(),"Kangkan");
        selectedpages.addFragment(new BlankFragment4(),"About");


        viewpager.setAdapter(selectedpages);

    }
}
