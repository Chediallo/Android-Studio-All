package sn.ipsl.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Camera extends AppCompatActivity {
    static final int REQ_IMG_CAPTURE =1;
    private ImageView imageView;
    private Button buttonPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        buttonPhoto = findViewById(R.id.buttonPhoto);
        buttonPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                try {
                    startActivityForResult(photoIntent, REQ_IMG_CAPTURE);
                }catch (ActivityNotFoundException e){

                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_IMG_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap bp = (Bitmap) extras.get("data");
            imageView = findViewById(R.id.imageView2);
            imageView.setImageBitmap(bp);
        }
    }
}