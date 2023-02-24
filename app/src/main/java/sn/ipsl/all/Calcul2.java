package sn.ipsl.all;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Calcul2 extends AppCompatActivity {
    private Button buttonHome;
    private Button buttonRetour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul2);
        buttonHome = findViewById(R.id.buttonHome3);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calcul2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public void Sinus(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextAutres);
        EditText et2 = (EditText)findViewById(R.id.editTextResultats);
        float n = Float.parseFloat(et1.getText().toString());
        float result = (float) Math.sin(n);

        et2.setText(""+result);
        et1.setText("");
    }
    public void Cosinus(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextAutres);
        EditText et2 = (EditText)findViewById(R.id.editTextResultats);
        float n = Float.parseFloat(et1.getText().toString());
        float result = (float) Math.cos(n);

        et2.setText(""+result);
        et1.setText("");
    }

    public void Expo(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextAutres);
        EditText et2 = (EditText)findViewById(R.id.editTextResultats);
        float n = Float.parseFloat(et1.getText().toString());
        float result = (float) Math.exp(n);

        et2.setText(""+result);
        et1.setText("");
    }
    public void Effacer2(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextAutres);
        EditText et2 = (EditText)findViewById(R.id.editTextResultats);
        et2.setText("");
        et1.setText("");
    }

}