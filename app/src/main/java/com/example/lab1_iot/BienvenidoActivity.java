package com.example.lab1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class BienvenidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        ImageView imageView5 = findViewById(R.id.imageView5);
        imageView5.setOnClickListener((view)->{
            finish();
        });
        ImageView imageView8 = findViewById(R.id.imageView8);
        imageView8.setOnClickListener((view)->{
            Intent intent = new Intent(this,DetailActivity.class);
            startActivity(intent);
        });
    }
}