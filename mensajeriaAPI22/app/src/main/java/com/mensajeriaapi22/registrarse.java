package com.mensajeriaapi22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrarse);
    }
    public void irRegistrado(View vista){
        Intent miIntent =new Intent(this, registro_confirm.class);
        startActivity(miIntent);
    }
}