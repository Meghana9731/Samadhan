package com.atixiansoftware.samadhan.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.atixiansoftware.samadhan.Model.Projectgetset;
import com.atixiansoftware.samadhan.Model.Vendorgetset;
import com.atixiansoftware.samadhan.R;

import java.util.List;


public class VendorAdapter extends RecyclerView.Adapter<VendorAdapter.ViewHolder> {
    List<Vendorgetset> vendorgetsets;
    Context context;
    public static final String SHARED_PREF_NAME = "myloginapp";

    public  class ViewHolder extends RecyclerView.ViewHolder{
        final TextView venname,ema,whatno,add;

        public ViewHolder(View itemView) {
            super(itemView);
            venname=itemView.findViewById(R.id.prg);
            ema=itemView.findViewById(R.id.prg6);
            whatno=itemView.findViewById(R.id.prg3);
            add=itemView.findViewById(R.id.prg4);


        }
    }


    public VendorAdapter(List<Vendorgetset> vendorgetsets, Context context) {
        this.vendorgetsets = vendorgetsets;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.vendordesign,parent,false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Vendorgetset vendorgetset=vendorgetsets.get(position);
        holder.venname.setText(vendorgetset.getFull_name());
        holder.ema.setText(vendorgetset.getEmail());
        holder.whatno.setText(vendorgetset.getWhatsapp_number());
        holder.add.setText(vendorgetset.getAddress());

    }
    @Override
    public int getItemCount() {
        return  vendorgetsets.size();

    }


}
