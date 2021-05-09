package com.example.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText valorEuro;
    Button kwanza;
    Button dolar;
    Button real;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorEuro = (EditText) findViewById(R.id.editTextTextPersonName);
        kwanza = (Button) findViewById(R.id.button);
        dolar = (Button) findViewById(R.id.button7);
        real = (Button) findViewById(R.id.button6);

        kwanza.setOnClickListener(c->{
            double converter;

            if (valorEuro.getText().toString().contains(",")){
                Toast.makeText(this, "Se pretender inserir um valor decimal deve substituir a vírgula pelo ponto", Toast.LENGTH_SHORT).show();
            }
            else {
                converter = Double.parseDouble(valorEuro.getText().toString()) * 789.50;
                Toast.makeText(this, "€ " + valorEuro.getText().toString() + " = " + "Kz " + converter, Toast.LENGTH_SHORT).show();
            }
        });

        dolar.setOnClickListener(c->{
            double converter;

            if (valorEuro.getText().toString().contains(",")){
                Toast.makeText(this, "Se pretender inserir um valor decimal deve substituir a vírgula pelo ponto", Toast.LENGTH_SHORT).show();
            }
            else {
                converter = Double.parseDouble(valorEuro.getText().toString()) * 1.21;
                Toast.makeText(this, "€ " + valorEuro.getText().toString() + " = " + "$ " + converter, Toast.LENGTH_SHORT).show();
            }
        });

        real.setOnClickListener(c->{
            double converter;

            if (valorEuro.getText().toString().contains(",")){
                Toast.makeText(this, "Se pretender inserir um valor decimal deve substituir a vírgula pelo ponto", Toast.LENGTH_SHORT).show();
            }
            else {
                converter = Double.parseDouble(valorEuro.getText().toString()) * 6.37;
                Toast.makeText(this, "€ " + valorEuro.getText().toString() + " = " + "R$ " + converter, Toast.LENGTH_SHORT).show();
            }
        });
    }
}