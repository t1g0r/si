package com.tigorworks.hitungbangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSegitiga = (Button) findViewById(R.id.btnSegitiga);

        buttonSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSegitiga = new Intent(MainActivity.this,ActivitySegitiga.class);
                startActivity(intentSegitiga);
            }
        });
    }


}
