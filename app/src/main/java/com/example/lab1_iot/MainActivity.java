package com.example.lab1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2= findViewById(R.id.button2);
        button2.setOnClickListener((view)->{
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener((view)->{
            Intent intent = new Intent(this, BienvenidoActivity.class);
            startActivity(intent);
        });
    }
}