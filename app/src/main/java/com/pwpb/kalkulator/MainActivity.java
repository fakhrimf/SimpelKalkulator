package com.pwpb.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText eTxtA, eTxtB, eTxtHasil;
    private Button btnTambah, btnKurang, btnBagi, btnKali;
    protected float fTxtA, fTxtB, fTxtHasil;

    private void initUI(){
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnBagi = findViewById(R.id.btnBagi);
        btnKali = findViewById(R.id.btnKali);
        eTxtA = findViewById(R.id.txtA);
        eTxtB = findViewById(R.id.txtB);
        eTxtHasil = findViewById(R.id.txtHasil);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        btnKurang.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        fTxtA = Float.parseFloat(eTxtA.getText().toString());
        fTxtB = Float.parseFloat(eTxtB.getText().toString());

        switch (v.getId()){
            case R.id.btnTambah:
                fTxtHasil = fTxtA + fTxtB;
                eTxtHasil.setText(Float.toString(fTxtHasil));
                break;
            case R.id.btnKurang:
                fTxtHasil = fTxtA - fTxtB;
                eTxtHasil.setText(Float.toString(fTxtHasil));
                break;
            case R.id.btnKali:
                fTxtHasil = fTxtA * fTxtB;
                eTxtHasil.setText(Float.toString(fTxtHasil));
                break;
            case R.id.btnBagi:
                fTxtHasil = fTxtA / fTxtB;
                eTxtHasil.setText(Float.toString(fTxtHasil));
                break;
        }
    }
}
