package com.tigorworks.uts_41818110087;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class SuhuActivity extends AppCompatActivity {

    private EditText edFrom;
    private EditText edTo;
    private Spinner spFrom;
    private Spinner spTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        // initiate
        edFrom      = (EditText) findViewById(R.id.edFrom);
        edTo        = (EditText) findViewById(R.id.edTo);
        spFrom      = (Spinner) findViewById(R.id.spinFrom);
        spTo        = (Spinner) findViewById(R.id.spinTo);


        TextWatcher tw = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                LakukanKonversi();
            }
        };

        AdapterView.OnItemSelectedListener onSelected = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                LakukanKonversi();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        edFrom.addTextChangedListener(tw);


        spFrom.setOnItemSelectedListener(onSelected);
        spTo.setOnItemSelectedListener(onSelected);


        // default value
        edFrom.setText("0");
        spFrom.setSelection(1);
        spTo.setSelection(2);

    }

    private void LakukanKonversi() {
        float tempFrom = (edFrom.getText().toString().equals("")?0:Float.valueOf(edFrom.getText().toString()));

        CSuhu suhu = new CSuhu();

        double ret = suhu.convertTemperature(tempFrom,spFrom.getSelectedItemPosition(),spTo.getSelectedItemPosition());

        edTo.setText(String.format("%.2f",ret));
    }
}
