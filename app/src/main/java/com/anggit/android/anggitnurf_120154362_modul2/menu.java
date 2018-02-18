package com.anggit.android.anggitnurf_120154362_modul2;

import android.view.Menu;

import java.util.ArrayList;

/**
 * Created by Anggit Nur on 2/17/2018.
 */

public class menu extends ArrayList<Menu> {
    static int photo;
    private static String nama;
    private static String harga;
    private static String komposisi;

    public menu(int photo, String nama, String harga, String komposisi) {
        //deklarasi variable
        this.photo = photo;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    //metode getter setter untuk memanggil nilai/variable
    public static int getPhoto() {
        return photo;
    }
    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public static String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public static String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }

    public static String getKomposisi() {
        return komposisi;
    }
    public void setKomposisi(String komposisi) {
        this.komposisi = komposisi;
    }
}