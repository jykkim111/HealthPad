package com.example.diet.response;

import com.example.diet.model.User;
import java.io.Serializable;

public class LoginResponse implements Serializable {
    public User user;
    public String jwt;
}
