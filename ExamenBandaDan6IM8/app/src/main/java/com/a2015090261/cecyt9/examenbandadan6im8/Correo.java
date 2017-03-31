package com.a2015090261.cecyt9.examenbandadan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by magic on 30/03/2017.
 */

public class Correo extends Activity {
    Double num;
    TextView pantallaview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        pantallaview = (TextView) findViewById(R.id.Muestrame);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        num = recibe.getDouble("Numero");
        pantallaview.setText("Nombre: Banda Almaraz Dan Emerson" + "\n" +
                "Resultado: " + num.toString()
        );
    }

    public void Compartir(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: Dan Banda Resultado: " + num);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "magicalex@outlook.es"} );
        startActivity(intent);
    }
}
