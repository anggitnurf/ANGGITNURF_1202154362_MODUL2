package com.anggit.android.anggitnurf_120154362_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        Intent intenta = getIntent();

        // Create the spinner.
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);

            // Create ArrayAdapter using the string array and default spinner layout.
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                    R.array.labels_array, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource
                    (android.R.layout.simple_spinner_dropdown_item);

            // Apply the adapter to the spinner.
            if (spinner != null) {
                spinner.setAdapter(adapter);
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void PesanSekarang(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
       String mejapesanan =  spinner.getSelectedItem().toString();

       //membuat toast untuk tombol pesansekarang jika di klik
       Toast.makeText(DineIn.this, "Meja Pesanan : " + mejapesanan, Toast.LENGTH_SHORT).show();

       //membuat intent untuk masuk ke menu selanjutnya
        Intent intentmenu = new Intent(DineIn.this, DaftarMenu.class);

        //jika masuk ke intent menu selanjutnya akan keluar tulisan dibawah
        Toast.makeText(DineIn.this, "Dine In", Toast.LENGTH_LONG).show();

        //mengaktifkan intent
        startActivity(intentmenu);

    }
}

