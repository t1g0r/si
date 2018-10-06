package com.tigorworks.hitungbangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    private Button buttonSegitiga;
    private Button buttonPrisma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSegitiga  = (Button) findViewById(R.id.btnSegitiga);
        buttonPrisma    = (Button) findViewById(R.id.btnPrisma);

        /* Cara onclick button pertama, diremark karena menggunakan implements onClick Class
        buttonSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSegitiga = new Intent(MainActivity.this,ActivitySegitiga.class);
                startActivity(intentSegitiga);
            }
        });

        buttonPrisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPrisma = new Intent(MainActivity.this,ActivityPrisma.class);
                startActivity(intentPrisma);
            }
        });
        */

        // cara 2 : by class
        // buttonPrisma.setOnClickListener(this);
        // buttonSegitiga.setOnClickListener(this);
    }

    // cara 3 : onclick didelare di xml (layout)
    public void ButtonSegitigaClick(View v){
        Intent intentSegitiga = new Intent(MainActivity.this,ActivitySegitiga.class);
        startActivity(intentSegitiga);
    }

    public void ButtonPrismaClick(View v){
        Intent intentPrisma = new Intent(MainActivity.this,ActivityPrisma.class);
        startActivity(intentPrisma);
    }



//    @Override
//    public void onClick(View v) {
//        System.out.println("disini");
//        if (v.getId() == buttonSegitiga.getId()){
//            Intent intentSegitiga = new Intent(this,ActivitySegitiga.class);
//            startActivity(intentSegitiga);
//        }else if (v.getId() == buttonPrisma.getId()){
//            Intent intentPrisma = new Intent(this,ActivityPrisma.class);
//            startActivity(intentPrisma);
//        }
//
//    }
}
