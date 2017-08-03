package com.example.dptoredes.leccion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PantallaJuego extends AppCompatActivity {

    TextView tusuario;
    MediaPlayer mp_01;
    MediaPlayer mp_02;
    MediaPlayer mp_03;
    MediaPlayer mp_04;
    MediaPlayer mp_05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_juego);

        tusuario = (TextView)findViewById(R.id.holaUsuario);

        Intent i = getIntent();
        String msg1 = i.getStringExtra("usuarionuevo");
        tusuario.setText("Hola "+ msg1);

        mp_01 = MediaPlayer.create(this, R.raw.one);

        final Button btn_01 = (Button) findViewById(R.id.btn_01);
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp_01.start();
                Toast.makeText(PantallaJuego.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

        mp_02 = MediaPlayer.create(this, R.raw.two);

        Button btn_02 = (Button) findViewById(R.id.btn_02);
        btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp_02.start();
                Toast.makeText(PantallaJuego.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

        mp_03 = MediaPlayer.create(this, R.raw.three);

        final Button btn_03 = (Button) findViewById(R.id.btn_03);
        btn_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp_03.start();
                Toast.makeText(PantallaJuego.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

        mp_04 = MediaPlayer.create(this, R.raw.four);

        final Button btn_04 = (Button) findViewById(R.id.btn_04);
        btn_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp_04.start();
                Toast.makeText(PantallaJuego.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });

        mp_05 = MediaPlayer.create(this, R.raw.five);

        final Button btn_05 = (Button) findViewById(R.id.btn_05);
        btn_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp_05.start();
                Toast.makeText(PantallaJuego.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void seguirJuego(View v){

        EditText player = (EditText)findViewById(R.id.nombre_ingresado);

        String player_name = player.getText().toString();
        String puntaje = "1 acierto";

        Intent intent= new Intent(PantallaJuego.this,PantallaJuego_02.class);
        intent.putExtra("usuarionuevo",player_name);
        intent.putExtra("puntaje",puntaje);
        startActivity(intent);

    }
}
