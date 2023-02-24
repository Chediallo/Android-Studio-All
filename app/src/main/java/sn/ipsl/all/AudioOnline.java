package sn.ipsl.all;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class AudioOnline extends AppCompatActivity {

    private Button playBtn, pauseBtn;
    private MediaPlayer mediaPlayeronline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_online);

        playBtn = findViewById(R.id.idBtnPlay);
        pauseBtn = findViewById(R.id.idBtnPause);

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio();
            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayeronline.isPlaying()) {

                    mediaPlayeronline.stop();
                    mediaPlayeronline.reset();
                    mediaPlayeronline.release();

                    Toast.makeText(AudioOnline.this, "Le fichier audio est mis en pause", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(AudioOnline.this, "Audio has not played", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void playAudio() {
        String audioUrl = "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3";

        mediaPlayeronline = new MediaPlayer();

        mediaPlayeronline.setAudioStreamType(AudioManager.STREAM_MUSIC);

        try {
            mediaPlayeronline.setDataSource(audioUrl);

            mediaPlayeronline.prepare();
            mediaPlayeronline.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Le fichier audio est en cours de lecture", Toast.LENGTH_SHORT).show();
    }

}