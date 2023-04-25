package com.example.lab1_iot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.setStatusBarColor(Color.parseColor("#5fec1d"));
        setContentView(R.layout.activity_detail);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener((view)->{
            Intent intent = new Intent(this, ConfirmationActivity.class);
            startActivity(intent);
        });

    }
}