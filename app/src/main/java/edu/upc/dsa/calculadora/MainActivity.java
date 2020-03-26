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

    public TextView pantalla;
    public double op1, op2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla=(TextView)findViewById(R.id.pantalla);
    }

    public void bt1 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"1";
        pantalla.setText(cap);
    }

    public void bt2 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"2";
        pantalla.setText(cap);
    }

    public void bt3 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"3";
        pantalla.setText(cap);
    }

    public void bt4 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"4";
        pantalla.setText(cap);
    }

    public void bt5 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"5";
        pantalla.setText(cap);
    }

    public void bt6 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"6";
        pantalla.setText(cap);
    }

    public void bt7 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"7";
        pantalla.setText(cap);
    }

    public void bt8 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"8";
        pantalla.setText(cap);
    }

    public void bt9 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"9";
        pantalla.setText(cap);
    }

    public void bt0 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"0";
        pantalla.setText(cap);
    }

    public void bt_punto (View v){
        String cap=pantalla.getText().toString();
        cap=cap+".";
        pantalla.setText(cap);
    }

    public void suma (View v){
        //Añadimos try/catch para que no haya error si pulsamos operacion sin introducir numeros
        try { //Obtenemos primer valor
            String aux1 = pantalla.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
            pantalla.setText(""); //Limpiamos pantalla
            ope = 1; //Identificador operacion
    }

    public void resta (View v){
        //Añadimos try/catch para que no haya error si pulsamos operacion sin introducir numeros
        try { //Obtenemos primer valor
            String aux1 = pantalla.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText(""); //Limpiamos pantalla
        ope = 2; //Identificador operacion
    }

    public void multiplicacion (View v){
        //Añadimos try/catch para que no haya error si pulsamos operacion sin introducir numeros
        try { //Obtenemos primer valor
            String aux1 = pantalla.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText(""); //Limpiamos pantalla
        ope = 3; //Identificador operacion
    }

    public void division (View v){
        //Añadimos try/catch para que no haya error si pulsamos operacion sin introducir numeros
        try { //Obtenemos primer valor
            String aux1 = pantalla.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText(""); //Limpiamos pantalla
        ope = 4; //Identificador operacion
    }

    public void sen (View v){
        //Añadimos try/catch para que no haya error si pulsamos operacion sin introducir numeros
        try { //Obtenemos primer valor
            String aux1 = pantalla.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("sen("+op1+")"); //Actualizamos pantalla
        ope = 5; //Identificador operacion
    }

    public void cos (View v){
        //Añadimos try/catch para que no haya error si pulsamos operacion sin introducir numeros
        try { //Obtenemos primer valor
            String aux1 = pantalla.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("cos("+op1+")"); //Actualizamos pantalla
        ope = 6; //Identificador operacion
    }

    public void tan (View v){
        //Añadimos try/catch para que no haya error si pulsamos operacion sin introducir numeros
        try { //Obtenemos primer valor
            String aux1 = pantalla.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("tan("+op1+")"); //Actualizamos pantalla
        ope = 7; //Identificador operacion
    }

    public void igual (View v){
        //Añadimos try/catch para op2 para que no haya error en las operaciones trigonometricas
        try { //Obtenemos primer valor
            String aux2 = pantalla.getText().toString();
            op2 = Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){}
        pantalla.setText(""); //Limpiamos pantalla

        if(ope==1)
            res=op1+op2;
        else if(ope==2)
            res=op1-op2;
        else if(ope==3)
            res=op1*op2;
        else if(ope==4){
            if(op2==0)
                pantalla.setText("Math error");
            else
                res=op1/op2;
        }else if(ope==5){
            double rad=Math.toRadians(op1);
            res=Math.sin(rad);
        }else if(ope==6){
            double rad=Math.toRadians(op1);
            res=Math.cos(rad);
        }else if(ope==7){
            double rad=Math.toRadians(op1);
            res=Math.tan(rad);
        }
    }
}