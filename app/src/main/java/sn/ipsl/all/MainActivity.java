package sn.ipsl.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button appel, sms, localisation, camera, calculatrice, audiolocal, audioonline, video, record,sqlite,firebase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appel = findViewById(R.id.btnAppel);
        appel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Appel.class);
                startActivity(i);
            }
        });

        sms = findViewById(R.id.btnSMS);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Sms.class);
                startActivity(i);
            }
        });

        localisation = findViewById(R.id.btnLocalisation);
        localisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Localisation.class);
                startActivity(i);
            }
        });

        camera = findViewById(R.id.btnCamera);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Camera.class);
                startActivity(i);
            }
        });

        calculatrice = findViewById(R.id.btnCalculatrice);
        calculatrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Calculatrice.class);
                startActivity(i);
            }
        });

        audiolocal = findViewById(R.id.btnAudioLocal);
        audiolocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Audio.class);
                startActivity(i);
            }
        });

        audioonline = findViewById(R.id.btnAudioOnline);
        audioonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AudioOnline.class);
                startActivity(i);
            }
        });

        video = findViewById(R.id.btnVideo);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Video.class);
                startActivity(i);
            }
        });

        record = findViewById(R.id.btnRecord);
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, EnregistrerAudio.class);
                startActivity(i);
            }
        });

        sqlite = findViewById(R.id.btnSqlite);

    }
}