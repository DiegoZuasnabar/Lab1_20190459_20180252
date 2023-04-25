package com.example.lab1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.setStatusBarColor(Color.parseColor("#eef0f0"));
        setContentView(R.layout.activity_main);
        Button button2= findViewById(R.id.button2);
        button2.setOnClickListener((view)->{
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener((view)->{
            EditText editText1 = findViewById(R.id.editTextTextPersonName3);
            String texto1 = editText1.getText().toString();
            EditText editText2 = findViewById(R.id.editTextTextPersonName4);
            String texto2 = editText2.getText().toString();

            if(texto1.length()!=0 && texto2.length()!=0){
                Intent intent = new Intent(this, BienvenidoActivity.class);
                startActivity(intent);
            }else{
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "Ingresa las credenciales", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}