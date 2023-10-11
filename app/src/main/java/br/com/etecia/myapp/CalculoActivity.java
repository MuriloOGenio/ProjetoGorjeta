package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.EventListener;

public class CalculoActivity extends AppCompatActivity {

    TextInputEditText txtValor;
    TextInputEditText txtQualidade;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        btnCalcular = findViewById(R.id.btnCalcular);
        txtQualidade = findViewById(R.id.txtQualidade);
        txtValor = findViewById(R.id.txtValor);



        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor, qualidade;
                valor = Integer.parseInt(txtValor.getText().toString());
                qualidade = Integer.parseInt(txtQualidade.getText().toString());

                Gorjeta gorjeta = new Gorjeta();
                gorjeta.setValor(valor);
                gorjeta.setQualidade(qualidade);
            }
        });
    }



}