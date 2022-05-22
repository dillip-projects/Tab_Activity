package com.example.tab_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout=findViewById(R.id.tablayout);
        TabItem tabchat=findViewById(R.id.chats);
        TabItem tabstatus=findViewById(R.id.status);
        TabItem tabcalls=findViewById(R.id.calls);

        ViewPager viewPager=findViewById(R.id.viewpager);

        MyAdapter myAdapter=new MyAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(myAdapter);

        //used to link the viewpagers to the tab layouts.
       tabLayout.setupWithViewPager(viewPager);
    }
}