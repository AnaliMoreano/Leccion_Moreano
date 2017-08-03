package com.example.dptoredes.leccion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaJuego extends AppCompatActivity {

    TextView tusuario;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_juego);

        tusuario = (TextView)findViewById(R.id.holaUsuario);

        Intent i = getIntent();
        String msg1 = i.getStringExtra("usuarionuevo");
        tusuario.setText("Hola "+ msg1);

        mp = MediaPlayer.create(this, R.raw.one);

        Button btn_01 = (Button) findViewById(R.id.btn_01);
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        mp = MediaPlayer.create(this, R.raw.two);

        Button btn_02 = (Button) findViewById(R.id.btn_02);
        btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });


        /*Button btn_try_again = (Button) findViewById(R.id.btn_nuevo);
        btn_try_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

    }
}
