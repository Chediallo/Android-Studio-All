package sn.ipsl.all;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class Audio extends AppCompatActivity {

    private Button stop, play, pause;
    private MediaPlayer mediaPlayerlocal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        mediaPlayerlocal = MediaPlayer.create(getApplicationContext(),R.raw.ima);


        stop = findViewById(R.id.stopButton);
        play = findViewById(R.id.playButton);
        pause = findViewById(R.id.pauseButton);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayerlocal.start();
                if(mediaPlayerlocal.isPlaying()){
                    Toast.makeText(Audio.this, "Le fichier audio est en cours de lecture", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Audio.this, "Le fichier audio n'a pas pu etre lu", Toast.LENGTH_SHORT).show();
                }
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerlocal.pause();
                mediaPlayerlocal.isPlaying();
                Toast.makeText(Audio.this, "Le fichier audio est mis en pause", Toast.LENGTH_SHORT).show();

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayerlocal.stop();
                Toast.makeText(Audio.this, "Le fichier audio est stoppé", Toast.LENGTH_SHORT).show();
                try {
                    mediaPlayerlocal.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}