package com.tigorworks.hitungbangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityPrisma extends AppCompatActivity {

    Button buttonHitung;
    EditText edAlas;
    EditText edTinggiSegitiga;
    EditText edTinggiPrisma;
    EditText edHasilVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma);


        buttonHitung        = (Button) findViewById(R.id.btnHitung);
        edAlas              = (EditText) findViewById(R.id.edAlas);
        edTinggiSegitiga    = (EditText) findViewById(R.id.edTinggiSegitiga);
        edTinggiPrisma      = (EditText) findViewById(R.id.edTinggiPrisma);
        edHasilVolume       = (EditText) findViewById(R.id.edHasilVolume);

        buttonHitung.setOnClickListener((View v) -> {
            Prisma prisma = new Prisma();

            prisma.setAlas(Integer.parseInt(edAlas.getText().toString()));
            prisma.setTinggiPrisma(Integer.parseInt(edTinggiPrisma.getText().toString()));
            prisma.setTinggiSegitiga(Integer.parseInt(edTinggiSegitiga.getText().toString()));
            edHasilVolume.setText(Double.toString(prisma.HitungVolume()));
        });

    }
}
