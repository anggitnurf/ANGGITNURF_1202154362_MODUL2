package com.anggit.android.anggitnurf_120154362_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {
    private EditText name, phone, alamat, catatan;
    private Button pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        name = (EditText)findViewById(R.id.editText2);
        phone = (EditText)findViewById(R.id.editText3);
        alamat = (EditText)findViewById(R.id.editText4);
        catatan = (EditText)findViewById(R.id.editText5);
        pilih = (Button)findViewById(R.id.button3);
    }

    public void pilih(View view) {
        String a = name.getText().toString();
        String b = phone.getText().toString();
        String c = alamat.getText().toString();
        String d = catatan.getText().toString();

        //jika data kosong maka keluar toast berikut
        if(a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty()){
            Toast.makeText(TakeAway.this,"Isi Data Lengkap", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(TakeAway.this,TakeAway.class);
            startActivity(intent);

            // jika telah diisi datanya maka akan ke screen selanjutnya
        }else{
            Toast.makeText(TakeAway.this,"Pilih Menu", Toast.LENGTH_LONG).show();
            Intent intent2 = new Intent(TakeAway.this,DaftarMenu.class);
            startActivity(intent2);
        }
    }}