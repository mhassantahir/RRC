package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signin extends AppCompatActivity {
EditText username,password;
Button signin,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        signup=findViewById(R.id.signup);
        signup=findViewById(R.id.signup);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
    }
}