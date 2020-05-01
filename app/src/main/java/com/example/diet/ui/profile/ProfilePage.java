package com.example.diet.ui.profile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.example.diet.BaseActivity;
import com.example.diet.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ProfilePage extends BaseActivity {

    FloatingActionButton edit;
    TextView name, location, email, age, height, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profile);
  //    final Context context = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        name = (TextView) findViewById(R.id.profile_name);
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String str = pref.getString("name", "");
        name.setText(str);

        location = findViewById(R.id.profile_loc);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        str = pref.getString("location", "");
        location.setText(str);

        email = findViewById(R.id.profile_id);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        str = pref.getString("email", "");
        email.setText(str);

        age = findViewById(R.id.profile_age);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        str = pref.getString("age", "");
        age.setText(str);

        height = findViewById(R.id.profile_height);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        str = pref.getString("height", "");
        height.setText(str);

        weight = findViewById(R.id.profile_weight);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        str = pref.getString("weight", "");
        weight.setText(str);

        edit = findViewById(R.id.profile_edit_btn);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit();
            }
        });
    }

    private void edit() {

        startActivity(new Intent(ProfilePage.this, EditProfile.class));
        finish();
    }

}
