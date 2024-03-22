package com.mensajeriaapi22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class publicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.publicos);
    }
    public void irPrivados(View vista){
        Intent miIntent =new Intent(this, privados.class);
        startActivity(miIntent);
    }
}