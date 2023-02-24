package sn.ipsl.all;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Calculatrice extends AppCompatActivity {
    private Button buttonHome;
    private Button buttonAutres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);
        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calculatrice.this,MainActivity.class);
                startActivity(intent);
            }
        });
        buttonAutres = (Button) findViewById(R.id.buttonAutres);
        buttonAutres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calculatrice.this,Calcul2.class);
                startActivity(intent);
            }
        });
    }
    public void Addition (View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result= n1+n2;

        et3.setText(""+result);
        et1.setText("");
        et2.setText("");
    }

    public void Soustraction(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result= n1-n2;

        et3.setText(""+result);
        et1.setText("");
        et2.setText("");
    }

    public void Multiplication (View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result= n1*n2;

        et3.setText(""+result);
        et1.setText("");
        et2.setText("");
    }

    public void Division (View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result= n1/n2;

        et3.setText(""+result);
        et1.setText("");
        et2.setText("");
    }
    public void Effacer(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        et1.setText("");
        et2.setText("");
        et3.setText("");
    }

}