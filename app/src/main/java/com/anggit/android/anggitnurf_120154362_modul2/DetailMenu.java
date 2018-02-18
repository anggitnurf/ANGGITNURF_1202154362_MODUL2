package com.anggit.android.anggitnurf_120154362_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailMenu extends AppCompatActivity {

    private ArrayList<Menu> menus;
    private TextView nama, harga, komposisi;
    private ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //mendeklarasi variable nama harga dkk
        nama = (TextView) findViewById(R.id.tvMenu);
        harga = (TextView) findViewById(R.id.tvHarga);
        komposisi = (TextView) findViewById(R.id.tvDetail);
        photo = (ImageView) findViewById(R.id.ivPhoto);

        //memanggil intent
        menus = DaftarMenu.listMenu;
        Intent c = getIntent();
        //memanggil nilai daru nama harga dkk
        nama.setText(menu.getNama());
        harga.setText(menu.getHarga());
        komposisi.setText(menu.getKomposisi());
        photo.setImageResource(menu.getPhoto());

    }
}




