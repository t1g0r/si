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
    EditText edHasilLuas;
    EditText edHasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        buttonHitung    = (Button) findViewById(R.id.btnHitung);
        edAlas          = (EditText) findViewById(R.id.edAlas);
        edTinggi        = (EditText) findViewById(R.id.edTinggi);
        edHasilLuas     = (EditText) findViewById(R.id.edHasilLuas);
        edHasilKeliling = (EditText) findViewById(R.id.edHasilKeliling);

        buttonHitung.setOnClickListener((v) -> {
            Segitiga segitiga = new Segitiga();

            segitiga.setAlas(Integer.parseInt(edAlas.getText().toString()));
            segitiga.setTinggi(Integer.parseInt(edTinggi.getText().toString()));
            edHasilLuas.setText(Double.toString(segitiga.HitungLuas()));
            edHasilKeliling.setText(Double.toString(segitiga.HitungKeliling()));
        });

    }
}
