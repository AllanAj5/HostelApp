package com.example.allanralph.hostelapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class FormPage extends AppCompatActivity {

    TabLayout tabby;
    ViewPager vpgr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_page);


        tabby= (TabLayout) findViewById(R.id.tabby);
        vpgr=(ViewPager)findViewById(R.id.vpgr);

        MyAdapter adapt= new MyAdapter(getSupportFragmentManager(),tabby.getTabCount());



        vpgr.setAdapter(adapt);

        vpgr.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabby));
    }
}
