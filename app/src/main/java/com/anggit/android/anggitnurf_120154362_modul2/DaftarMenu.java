package com.anggit.android.anggitnurf_120154362_modul2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    //membuat arraylist
    public static ArrayList<Menu> listMenu = new ArrayList<>();

    //memasukkan variable kedalam viewholder untuk recyclerview dan menuadapter
    private RecyclerView recyclerView;
    private MenuAdapter mAdapter;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        ArrayList<menu> listMenu = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MenuAdapter(listMenu);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        // Give the RecyclerView a default layout manager.
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // Connect the adapter with the RecyclerView.
        recyclerView.setAdapter(mAdapter);

    }
    //isi dari menu
    public ArrayList<menu> isiMenu() {
        ArrayList<menu> data = new ArrayList<>();

        data.add(new menu(R.drawable.sate, "Sate", "Harga : Rp 15.000", "sate ayam yang enak pas untuk perut lapar"));

        return data;
    }
}