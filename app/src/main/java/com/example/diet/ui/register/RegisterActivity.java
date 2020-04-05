package com.example.diet.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.diet.BaseActivity;
import com.example.diet.R;

public class RegisterActivity extends BaseActivity {
    EditText username, password, passwordConfirmation;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = findViewById(R.id.register_username);
        password = findViewById(R.id.register_password);
        passwordConfirmation = findViewById(R.id.register_password_confirmation);
        register = findViewById(R.id.register_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }
    private boolean validateInputs(){
        if(password.getText().equals(passwordConfirmation.getText())){
            return true;
        }else{
            return false;
        }
    }
    private void register(){
        if(validateInputs()){

        }else{
            // display err message
        }
    }
}
