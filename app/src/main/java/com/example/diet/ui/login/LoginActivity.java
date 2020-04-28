package com.example.diet.ui.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.diet.BaseActivity;
import com.example.diet.R;
import com.example.diet.http.Retrofits;
import com.example.diet.http.service.UserService;
import com.example.diet.response.LoginResponse;
import com.example.diet.ui.MainActivity;
import com.example.diet.ui.register.RegisterActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends BaseActivity {
    TextView title, register, error;
    EditText username, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.login_username);
        password = findViewById(R.id.login_password);
        register = findViewById(R.id.login_register);
        error = findViewById(R.id.login_error);
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

    private boolean validateInputs(String username, String password){
        if(!username.isEmpty() && !password.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    private void displayError(String msg){
        error.setText(msg);
        error.setVisibility(View.VISIBLE);
    }
    private void hideError(){
        error.setVisibility(View.INVISIBLE);
    }

    private void login(){
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
        // Will uncomment this later!
        /*
        if(validateInputs(username.getText().toString(), password.getText().toString())){
            hideError();
            UserService userService = Retrofits.createService(UserService.class);
            Call<LoginResponse> call = userService.login(username.getText().toString(), password.getText().toString());
            call.enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    if(response.isSuccessful()){
                        // shared preferences
                        SharedPreferences pref = LoginActivity.this.getSharedPreferences("user", MODE_PRIVATE);
                        SharedPreferences.Editor editor = pref.edit();
                        editor.putString("jwt", "jwt " + response.body().jwt);
                        editor.commit();
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        finish();
                    }else{
                        //login failed
                        displayError("username or password is incorrect");
                    }
                }
                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    t.printStackTrace();
                    Toast.makeText(LoginActivity.this, "Network error occurred",Toast.LENGTH_SHORT).show();
                }
            });
        }else{
            displayError("username and password cannot be empty");
        }*/
    }
    private void register(){
        startActivity(new Intent(this, RegisterActivity.class));
    }
}
