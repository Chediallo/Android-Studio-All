package sn.ipsl.all;

import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.net.Uri;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Appel extends AppCompatActivity {
    private EditText edittext;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appel);

        button = findViewById(R.id.button);
        edittext = findViewById(R.id.editText);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg)
            {
                String phone_number = edittext.getText().toString();

                Intent phone_intent = new Intent(Intent.ACTION_CALL);

                phone_intent.setData(Uri.parse("tel:" + phone_number));

                startActivity(phone_intent);
            }
        });
    }
}