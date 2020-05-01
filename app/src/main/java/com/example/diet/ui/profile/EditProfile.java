package com.example.diet.ui.profile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;

import com.example.diet.BaseActivity;
import com.example.diet.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EditProfile extends BaseActivity{

        FloatingActionButton save;
        EditText name, location, email, age, height, weight;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_profileedit);
            final Context context = this;

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            name = findViewById(R.id.profile_name);
            location = findViewById(R.id.profile_loc);
            email = findViewById(R.id.profile_id);
            age = findViewById(R.id.profile_age);
            height = findViewById(R.id.profile_height);
            weight = findViewById(R.id.profile_weight);
            save = findViewById(R.id.profile_edit_btn);
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit();
                }
            });
        }

    private void edit() {

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name", name.getText().toString());
        editor.putString("location", location.getText().toString());
        editor.putString("email", email.getText().toString());
        editor.putString("age", age.getText().toString());
        editor.putString("height", height.getText().toString());
        editor.putString("weight", weight.getText().toString());

        editor.apply();
        startActivity(new Intent(EditProfile.this, ProfilePage.class));
        finish();
    }

}
