package com.example.diet.ui;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.diet.BaseActivity;
import com.example.diet.R;
import com.example.diet.ui.analyze.CameraActivity;
import com.example.diet.ui.chat.ChatFragment;
import com.example.diet.ui.home.HomeFragment;
import com.example.diet.ui.calendar.CalendarFragment;
import com.example.diet.ui.profile.ProfilePage;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends BaseActivity implements DatePickerDialog.OnDateSetListener {
    private DrawerLayout drawer;
    int year;
    int month;
    int dayOfMonth;
    Calendar myCalendar;
    private TextView toolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = this;

        //set up top toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //set date on toolbar

        String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        toolbarTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        toolbarTitle.setText(date);
        toolbarTitle.setTextColor(Color.WHITE);
        toolbarTitle.setTextSize(15);

        toolbarTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });




        // Set up bottom navigation view
        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()){
                    case R.id.menu_main_Home:
                        selectedFragment = HomeFragment.newInstance();
                        break;
                    case R.id.menu_main_My_Log:
                        startActivity(new Intent(context, CameraActivity.class));
                        return false;
                    case R.id.menu_main_To_dos:
                        selectedFragment = CalendarFragment.newInstance();
                        break;
                    case R.id.menu_main_chat:
                        selectedFragment = ChatFragment.newInstance();
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, selectedFragment);
                transaction.commit();
                return true;
            }
        });

        // Home menu clicked when app is first opened
        bottomNavigationView.setSelectedItemId(R.id.menu_main_Home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.top_navigator, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_profile:
                startActivity(new Intent(this, ProfilePage.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = year+ "-" + (month+1) + "-" + dayOfMonth;
        toolbarTitle.setText(date);
    }
}
