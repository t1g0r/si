package com.tigorworks.uts_41818110087;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SilinderClick(View v){
        Intent i = new Intent(MainActivity.this,SilinderActivity.class);
//        Intent i    = new Intent(MainActivity.this,SilinderActivity.class);
        startActivity(i);
    }

    public void SuhuClick(View v){
        Intent i = new Intent(MainActivity.this,SuhuActivity.class);
        startActivity(i);
    }
}
