package com.example.diet.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.diet.R;
import com.example.diet.ui.home.ui.main.SectionsPagerAdapter;
import com.example.diet.ui.profile.ProfilePage;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class CaloriesFragment extends Fragment {

    View view;
    View homeView;

    private ProfilePage profilePage;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem calorie_tab, nut_tab;
    public SectionsPagerAdapter pagerAdapter;

    public static CaloriesFragment newInstance() {
        CaloriesFragment fragment = new CaloriesFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_calories, container, false);

        return view;
    }

}
