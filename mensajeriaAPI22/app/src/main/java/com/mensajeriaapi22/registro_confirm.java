package com.mensajeriaapi22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registro_confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_confirm);
    }
    public void irIngresar(View vista){
        Intent miIntent =new Intent(this, ingresar.class);
        startActivity(miIntent);
    }
}