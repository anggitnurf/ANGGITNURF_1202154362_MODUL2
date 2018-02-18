package com.anggit.android.anggitnurf_120154362_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //untuk splash screen sebelum masuk ke menu, 3000 = 3 detik
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //membuat intent untuk masuk ke screen selanjutnya
                Intent homeIntent = new Intent(MainActivity.this, SplashScreen.class);

                //jika telah masuk maka akan memunculkan toast dibawah
                Toast.makeText(MainActivity.this, "ANGGITNURF_1202154362", Toast.LENGTH_LONG).show();

                //memulai intent
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
        }
}
