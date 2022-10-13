package br.ulbra.appcalc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtValor1, edtValor2;
    Button btnSomar, btnSubtracao, btnMulti, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor1 = findViewById(R.id.edtv1);
        edtValor2 = findViewById(R.id.edtv2);
        btnSomar = findViewById(R.id.btn);
        btnSubtracao = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Valor1, Valor2, soma;
                Valor1 = Double.parseDouble(
                        edtValor1.getText().toString());

                Valor2 = Double.parseDouble(
                        edtValor2.getText().toString());
                soma = Valor1 + Valor2;

                Toast.makeText(MainActivity.this,
                        "A soma dos valores é :" + soma, Toast.LENGTH_LONG).show();
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double Valor1, Valor2, sub;
                Valor1 = Double.parseDouble(
                        edtValor1.getText().toString());

                Valor2 = Double.parseDouble(
                        edtValor2.getText().toString());
                sub = Valor1 - Valor2;

                Toast.makeText(MainActivity.this,
                        "A subtração dos valores é :" + sub, Toast.LENGTH_LONG).show();
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double Valor1, Valor2, sub, multi, div;
                Valor1 = Double.parseDouble(
                        edtValor1.getText().toString());

                Valor2 = Double.parseDouble(
                        edtValor2.getText().toString());
                multi = Valor1 * Valor2;

                Toast.makeText(MainActivity.this,
                        "A multiplicação dos valores é :" + multi, Toast.LENGTH_LONG).show();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double Valor1, Valor2, sub, multi, div;
                Valor1 = Double.parseDouble(
                        edtValor1.getText().toString());

                Valor2 = Double.parseDouble(
                        edtValor2.getText().toString());
                div = Valor1 / Valor2;

                Toast.makeText(MainActivity.this,
                        "A divisão dos valores é :" + div, Toast.LENGTH_LONG).show();
            }
        });


    }
}