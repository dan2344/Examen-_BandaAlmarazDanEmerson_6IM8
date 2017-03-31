package com.a2015090261.cecyt9.examenbandadan;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText num;
    Double res;
    Double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) findViewById(R.id.txtNumero);
        System.out.println("Continua en proceso" );

    }


    public void Convertir(View v){
        System.out.println("Continua en proceso" );
        if(num.getText().toString().equals("")){
            Toast toast =  Toast.makeText(getApplicationContext(), "Empty", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            Intent envia = new Intent(this, Correo.class);
            Bundle datos = new Bundle();
            num2 = Double.parseDouble(num.getText().toString());
            res = (num2 / 15);
            datos.putDouble("Numero", res);
            envia.putExtras(datos);
            System.out.println("En proceso" );
            finish();
            startActivity(envia);
            System.out.println("En proceso");
        }
    }
    }


