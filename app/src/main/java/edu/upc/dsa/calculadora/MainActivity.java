package edu.upc.dsa.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    double operacion1;
    double operacion2;
    double result;
    int igual=0;
    int suma=0;
    int resta=0;
    int multiplicacion=0;
    int division=0;
    boolean inicio;
    String operacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView pantalla = findViewById((R.id.pantalla));
        final Button btn1 = findViewById(R.id.button1);
        final Button btn2 = findViewById(R.id.button2);
        final Button btn3 = findViewById(R.id.button3);
        final Button btn4 = findViewById(R.id.button4);
        final Button btn5 = findViewById(R.id.button5);
        final Button btn6 = findViewById(R.id.button6);
        final Button btn7 = findViewById(R.id.button7);
        final Button btn8 = findViewById(R.id.button8);
        final Button btn9 = findViewById(R.id.button9);
        final Button btn0 = findViewById(R.id.button0);
        final Button btn_igual = findViewById(R.id.button_igual);
        final Button btn_suma = findViewById(R.id.button_suma);
        final Button btn_resta = findViewById(R.id.button_resta);
        final Button btn_prod = findViewById(R.id.button_prod);
        final Button btn_delete = findViewById(R.id.button_clear);
        final Button btn_division = findViewById(R.id.button_division);
        final Button btn_punto = findViewById(R.id.button_punto);
        final Button btn_sen = findViewById(R.id.button_sen);
        final Button btn_cos = findViewById(R.id.button_cos);
        final Button btn_tan = findViewById(R.id.button_tan);
        final Button btn_grados= findViewById(R.id.button_grados);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn0.getText().toString());
                } else {
                    pantalla.setText(btn0.getText().toString());
                    inicio = true;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn1.getText().toString());
                } else {
                    pantalla.setText(btn1.getText().toString());
                    inicio = true;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn2.getText().toString());
                } else {
                    pantalla.setText(btn2.getText().toString());
                    inicio = true;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn3.getText().toString());
                } else {
                    pantalla.setText(btn3.getText().toString());
                    inicio = true;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn4.getText().toString());
                } else {
                    pantalla.setText(btn4.getText().toString());
                    inicio = true;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn5.getText().toString());
                } else {
                    pantalla.setText(btn5.getText().toString());
                    inicio = true;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn6.getText().toString());
                } else {
                    pantalla.setText(btn6.getText().toString());
                    inicio = true;
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn7.getText().toString());
                } else {
                    pantalla.setText(btn7.getText().toString());
                    inicio = true;
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn8.getText().toString());
                } else {
                    pantalla.setText(btn8.getText().toString());
                    inicio = true;
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn9.getText().toString());
                } else {
                    pantalla.setText(btn9.getText().toString());
                    inicio = true;
                }
            }
        });

        btn_punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn_punto.getText().toString());
                } else {
                    pantalla.setText(btn_punto.getText().toString());
                    inicio = true;
                }
            }
        });
    }
}