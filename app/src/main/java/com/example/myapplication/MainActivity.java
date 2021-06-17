package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText fname,sname,address,email,dob,contact;
    Button signup,signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.fname);
        sname=findViewById(R.id.sname);
        address=findViewById(R.id.address);
        email=findViewById(R.id.email);
        dob=findViewById(R.id.dob);
        contact=findViewById(R.id.contact);
        signup=findViewById(R.id.signup);
        signin=findViewById(R.id.signin);
    }
}