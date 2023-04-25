package com.example.lab1_iot;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.setStatusBarColor(Color.parseColor("#eef0f0"));
        setContentView(R.layout.activity_confirmation);
        ImageView imageView4 = findViewById(R.id.imageView4);
        imageView4.setOnClickListener((view)->{
            finish();
        });
        Button button = findViewById(R.id.button5);
        button.setOnClickListener((view)->{

            String texto =null;
            CheckBox checkBox2 = findViewById(R.id.checkBox2);
            CheckBox checkBox3 = findViewById(R.id.checkBox3);
            CheckBox checkBox4 = findViewById(R.id.checkBox4);
            Boolean c2 = checkBox2.isChecked();
            Boolean c3 = checkBox3.isChecked();
            Boolean c4 = checkBox4.isChecked();
            if(c2==false && c3==false && c4==false){
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "Selecciona al menos 1 ticket", Toast.LENGTH_SHORT);
                toast.show();
            }else{
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                alertDialog.setTitle("Felicidades!!!");
                alertDialog.setPositiveButton("Entiendo",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
                if(c2==true && c3==false && c4==false){
                    texto ="Su compra de 1 ticket con un valor total de S/30.00 fue realizado con éxito";
                }
                if(c2==false && c3==true && c4==false){
                    texto ="Su compra de 1 ticket con un valor total de S/26.00 fue realizado con éxito";
                }
                if(c2==false && c3==false && c4==true){
                    texto ="Su compra de 1 ticket con un valor total de S/23.00 fue realizado con éxito";
                }
                if(c2==true && c3==true && c4==false){
                    texto ="Su compra de 2 tickets con un valor total de S/56.00 fue realizado con éxito";
                }
                if(c2==false && c3==true && c4==true){
                    texto ="Su compra de 2 tickets con un valor total de S/49.00 fue realizado con éxito";
                }
                if(c2==true && c3==false && c4==true){
                    texto ="Su compra de 2 tickets con un valor total de S/53.00 fue realizado con éxito";
                }
                if(c2==true && c3==true && c4==true){
                    texto ="Su compra de 3 tickets con un valor total de S/79.00 fue realizado con éxito";
                }


                alertDialog.setMessage(texto);
                alertDialog.show();
            }

        });

    }
}