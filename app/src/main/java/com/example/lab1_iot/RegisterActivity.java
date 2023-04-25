package com.example.lab1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button button5= findViewById(R.id.button5);
        button5.setOnClickListener((view)->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}