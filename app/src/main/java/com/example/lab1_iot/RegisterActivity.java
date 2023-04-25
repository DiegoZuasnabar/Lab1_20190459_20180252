package com.example.lab1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

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
        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);

        Button button4= findViewById(R.id.button4);
        button4.setOnClickListener((view)->{
            EditText editText1 = findViewById(R.id.editText1);
            String texto1 = editText1.getText().toString();
            EditText editText2 = findViewById(R.id.editText2);
            String texto2 = editText2.getText().toString();
            EditText editText3 = findViewById(R.id.editText3);
            String texto3 = editText3.getText().toString();
            EditText editText4 = findViewById(R.id.editText4);
            String texto4 = editText4.getText().toString();

            if(checkBox1.isChecked() && checkBox2.isChecked() && texto1.length()!=0 && texto2.length()!=0&& texto3.length()!=0&& texto4.length()!=0){
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }else{
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "Rellena todos los campos", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}