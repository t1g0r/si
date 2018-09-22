package com.tigorworks.hitungbangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivitySegitiga extends AppCompatActivity {
    Button buttonHitung;
    EditText edAlas;
    EditText edTinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        buttonHitung    = (Button) findViewById(R.id.btnHitung);
        edAlas          = (EditText) findViewById(R.id.edAlas);
        edTinggi        = (EditText) findViewById(R.id.edTinggi);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Segitiga segitiga = new Segitiga();

                segitiga.setAlas(Integer.parseInt(edAlas.getText().toString()));
                segitiga.setTinggi(Integer.parseInt(edTinggi.getText().toString()));
                Toast.makeText(getApplicationContext(),"Luasnya : " + Double.toString(segitiga.HitungLuas()), Toast.LENGTH_LONG).show();
            }
        });
    }
}
