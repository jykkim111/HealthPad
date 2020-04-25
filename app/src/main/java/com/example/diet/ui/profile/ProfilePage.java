package com.example.diet.ui.profile;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import com.example.diet.BaseActivity;
import com.example.diet.R;

public class ProfilePage extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profile);
        final Context context = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
