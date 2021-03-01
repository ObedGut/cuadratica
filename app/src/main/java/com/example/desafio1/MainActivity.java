package com.example.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valora, valorb, valorc;

    Button calcular;

    TextView resultado;

    double a, b, c, d, x1, x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valora = (EditText) findViewById(R.id.valora);
        valorb = (EditText) findViewById(R.id.valorb);
        valorc = (EditText) findViewById(R.id.valorc);

        calcular = (Button) findViewById(R.id.calcular);

        resultado = (TextView) findViewById(R.id.resultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!valora.getText().toString().equals("") && !valorb.getText().toString().equals("") && !valorc.getText().toString().equals("")){

                    a = Double.parseDouble(valora.getText().toString());
                    b = Double.parseDouble(valorb.getText().toString());
                    c = Double.parseDouble(valorc.getText().toString());

                    d = Math.pow(b, 2) - 4*a*c;

                    if (d == 0){
                        x1 = -b/(2*a);
                        resultado.setText("d ="+ d + "\nx = " + x1);
                    } else if (d<0){
                        resultado.setText("No se puede Factorizar");
                    }else if (d>0){
                        x1 = (-b + Math.sqrt(d))/(2*a);
                        x2 = (-b - Math.sqrt(d))/(2*a);
                        resultado.setText("d ="+ d + "\nx1 = " + x1 + "\nx2 =" + x2);
                    }

                }
            }
        });
    }
}