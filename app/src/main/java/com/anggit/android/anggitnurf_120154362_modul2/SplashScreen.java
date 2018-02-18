package com.anggit.android.anggitnurf_120154362_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    private static final String TAG_ACTIVITY = SplashScreen.class.getSimpleName();
    private RadioGroup radioGroup;
    private RadioButton rButton1;
    private RadioButton rButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);

        radioGroup= (RadioGroup)findViewById(R.id.radio_group);
        rButton1 = (RadioButton)findViewById(R.id.radioButton);
        rButton2 = (RadioButton)findViewById(R.id.radioButton2);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


    public void PesanSekarang(View view) {
        //membuat if else jika radio button di klik untuk tulisan dine in atau take away
        if (rButton1.isChecked()){
            Intent intenta = new Intent(SplashScreen.this, DineIn.class);
            Toast.makeText(SplashScreen.this, "Dine In", Toast.LENGTH_LONG).show();
            startActivity(intenta);
        }else
            if (rButton2.isChecked()){
                Intent intentb = new Intent(SplashScreen.this, TakeAway.class);
                Toast.makeText(SplashScreen.this, "Take Away", Toast.LENGTH_LONG).show();
                startActivity(intentb);
            }
        }

    }

