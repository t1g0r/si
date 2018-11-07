package com.tigorworks.uts_41818110087;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class SilinderActivity extends AppCompatActivity {

    private EditText editJariJari;
    private EditText editTinggi;
    private TextView txtLingkaranLuas;
    private TextView txtLingkaranKeliling;
    private  TextView txtSilinderVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silinder);

        // initiate komponen ui
        editJariJari            = findViewById(R.id.editJariJari);
        editTinggi              = findViewById(R.id.editTinggi);
        txtLingkaranLuas        = findViewById(R.id.txtLuasLingkaran);
        txtLingkaranKeliling    = findViewById(R.id.txtKelilingLingkaran);
        txtSilinderVolume       = findViewById(R.id.txtVolumeSilinder);

        // inisiasi nilai
        editJariJari.setText("0");
        editTinggi.setText("0");

        // define onchange text edit
        TextWatcher tw  = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                float r         = (editJariJari.getText().toString().equals("")?0:Float.valueOf(editJariJari.getText().toString()));
                float h         = (editTinggi.getText().toString().equals("")?0:Float.valueOf(editTinggi.getText().toString()));

                txtLingkaranLuas.setText("0");
                txtLingkaranKeliling.setText("0");
                txtSilinderVolume.setText("0");

                CSilinder silinder = new CSilinder();
                silinder.getLingkaran().setR(r);
                silinder.setTinggi(h);


                txtLingkaranLuas.setText(String.format("%.2f",silinder.getLingkaran().HitungLuasLingkaran()));
                txtLingkaranKeliling.setText(String.format("%.2f",silinder.getLingkaran().HitungKelilingLingkaran()));
                txtSilinderVolume.setText(String.format("%.2f",silinder.HitungVolumeSilinder()));


            }
        };

        // set event untuk TextEdit
        editTinggi.addTextChangedListener(tw);
        editJariJari.addTextChangedListener(tw);

        editJariJari.requestFocus();


    }
}
