package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.EventListener;

public class CalculoActivity extends AppCompatActivity {

    TextInputLayout txtValor = findViewById(R.id.txtValor);
    TextInputLayout txtQualidade = findViewById(R.id.txtQualidade);
    Button btnCalcular = findViewById(R.id.btnCalcular);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
    }



}