package com.example.diet.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.diet.BaseActivity;
import com.example.diet.R;
import com.example.diet.ui.MainActivity;
import com.example.diet.ui.register.RegisterActivity;

public class LoginActivity extends BaseActivity {
    TextView title, register;
    EditText username, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        title = (TextView) findViewById(R.id.titlebarText);
        title.setText("HealthPad");

        username = findViewById(R.id.login_username);
        password = findViewById(R.id.login_password);
        register = findViewById(R.id.login_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
        login = findViewById(R.id.login_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    private void login(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
    private void register(){
        startActivity(new Intent(this, RegisterActivity.class));
        finish();
    }
}
