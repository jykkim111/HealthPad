package com.example.diet.ui.exercise;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.diet.BaseActivity;
import com.example.diet.R;

public class ActivityDetails extends BaseActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_exercise_detail);
        final Context context = this;

        Intent intent = getIntent();

        String activityName = intent.getStringExtra("activity");
        getSupportActionBar().setTitle(activityName);
        

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
