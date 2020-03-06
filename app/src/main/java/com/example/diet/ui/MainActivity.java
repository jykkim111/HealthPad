package com.example.diet.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.diet.BaseActivity;
import com.example.diet.R;
import com.example.diet.ui.analyze.AnalyzeFragment;
import com.example.diet.ui.analyze.CameraActivity;
import com.example.diet.ui.home.HomeFragment;
import com.example.diet.ui.mypage.MypageFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = this;

        // Set up bottom navigation view
        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.main_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()){
                    case R.id.menu_main_home:
                        selectedFragment = HomeFragment.newInstance();
                        break;
                    case R.id.menu_main_analyze:
                        startActivity(new Intent(context, CameraActivity.class));
                        return false;
                    case R.id.menu_main_mypage:
                        selectedFragment = MypageFragment.newInstance();
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.main_body, selectedFragment);
                transaction.commit();
                return true;
            }
        });

        // Home menu clicked when app is first opened
        bottomNavigationView.setSelectedItemId(R.id.menu_main_home);
    }

}
