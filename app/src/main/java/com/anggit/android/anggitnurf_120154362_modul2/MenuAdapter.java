package com.anggit.android.anggitnurf_120154362_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Anggit Nur on 2/17/2018.
 */

//untuk menggunakan viewholder tampilan yang spesifik di aplikasi dan didefinisikan dalam MenuAdapter
public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {

    private ArrayList<menu> listMenu;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView photo;
        public TextView nama, harga, tanda;

        public MyViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.photo);
            nama = (TextView) itemView.findViewById(R.id.nama);
            harga = (TextView) itemView.findViewById(R.id.harga);
            tanda = (TextView) itemView.findViewById(R.id.tanda);
        }
    }

    public MenuAdapter(ArrayList<menu> listMenu) {

        this.listMenu = listMenu;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //membuat layout inflater
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_menu, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    //bindviewholder mengoneksikan data dengan view holder
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        menu menu = listMenu.get(position);
        holder.tanda.setText("" + position);
        holder.photo.setImageResource(menu.getPhoto());
        holder.nama.setText(menu.getNama());
        holder.harga.setText(menu.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String komp = holder.tanda.getText().toString();
                Log.d("ItemMenuCLICKED", "ID:" + komp);
                Intent i = new Intent(view.getContext().getApplicationContext(), DetailMenu.class);
                i.putExtra("MenuID", "" + komp);
                view.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {

        return listMenu.size();
    }
}
