package com.example.dptoredes.leccion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String tag;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText player = (EditText)findViewById(R.id.nombre_ingresado);

        Button btnjugar = (Button) findViewById(R.id.btnjugar);


    }

    public void empezarJuego(View v){

        EditText player = (EditText)findViewById(R.id.nombre_ingresado);

        String player_name = player.getText().toString();

        Intent intent= new Intent(MainActivity.this,PantallaJuego.class);
        intent.putExtra("usuarionuevo",player_name);
        startActivity(intent);

    }
}
