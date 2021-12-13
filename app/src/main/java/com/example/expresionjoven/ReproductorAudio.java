package com.example.expresionjoven;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReproductorAudio extends AppCompatActivity {
    Button play_pausa;
    MediaPlayer MediaP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido_reflexion);

        play_pausa = (Button) findViewById(R.id.boton_playpausa);

        MediaP = MediaPlayer.create(this,R.raw.musica_de_fondo);

        play_pausa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (MediaP.isPlaying()) {
                    MediaP.pause();
                    play_pausa.setBackgroundResource(R.drawable.imagen_boton_play);
                    Toast.makeText(ReproductorAudio.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    MediaP.start();
                    play_pausa.setBackgroundResource(R.drawable.imagen_boton_pausa);
                    Toast.makeText(ReproductorAudio.this, "Reproducir", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
