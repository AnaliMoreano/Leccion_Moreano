package com.example.dptoredes.leccion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaJuego_02 extends AppCompatActivity {

    TextView tusuario;
    TextView puntaje;
    MediaPlayer mp_01;
    MediaPlayer mp_02;
    MediaPlayer mp_03;
    MediaPlayer mp_04;
    MediaPlayer mp_05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_juego_02);

        tusuario = (TextView)findViewById(R.id.holaUsuario);
        puntaje = (TextView)findViewById(R.id.aciertos);

        Intent i = getIntent();
        String msg1 = i.getStringExtra("usuarionuevo");
        String msg2 = i.getStringExtra("puntaje");
        tusuario.setText("Hola "+ msg1);
        puntaje.setText(msg2);

        mp_01 = MediaPlayer.create(this, R.raw.one);

        Button btn_01 = (Button) findViewById(R.id.btn_01);
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp_01.start();
            }
        });


        mp_02 = MediaPlayer.create(this, R.raw.two);

        Button btn_02 = (Button) findViewById(R.id.btn_02);
        btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp_02.start();
            }
        });
    }
}
