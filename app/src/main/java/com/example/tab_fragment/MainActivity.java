package com.example.tab_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.example.tab_fragment.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

import FragmentAdapter.FragmentAdapter;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentAdapter adapter;
        adapter = new FragmentAdapter(getSupportFragmentManager());

        adapter.addFragment(new Fragment_one(),"Tab-1");
        adapter.addFragment(new Fragment_Two(),"Tab-2");
        adapter.addFragment(new Fragment_Three(),"Tab-3");

        viewPager=findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        tabLayout=findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}