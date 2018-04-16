package com.example.eggshell;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;



public class MainActivity extends AppCompatActivity {
    fragment1 fragment1;
    fragment2 fragment2;
    fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new fragment1();
        fragment2 = new fragment2();
        fragment3 = new fragment3();


        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment1).commit();

        TabLayout tabs = (TabLayout)findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("인터랙션"));
        tabs.addTab(tabs.newTab().setText("편의시설"));
        tabs.addTab(tabs.newTab().setText("레스토랑"));

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
              int position = tab.getPosition();

                Fragment selected = null;
                if(position==0){
                    selected = fragment1;
                }else if (position == 1){
                    selected = fragment2;
                }else if (position ==2){
                    selected = fragment3;
                }
            getSupportFragmentManager().beginTransaction().replace(R.id.container,selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    }

