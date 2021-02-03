package com.atixiansoftware.samadhan.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.atixiansoftware.samadhan.Model.Proceduregetset;
import com.atixiansoftware.samadhan.Model.Projectgetset;
import com.atixiansoftware.samadhan.R;

import java.util.List;


public class ProcedureAdapter extends RecyclerView.Adapter<ProcedureAdapter.ViewHolder> {
    List<Proceduregetset> proceduregetsets;
    Context context;
    public static final String SHARED_PREF_NAME = "myloginapp";

    public  class ViewHolder extends RecyclerView.ViewHolder{
        final TextView proce,desc;

        public ViewHolder(View itemView) {
            super(itemView);
            proce=itemView.findViewById(R.id.prg1);
            desc=itemView.findViewById(R.id.prg2);


        }
    }


    public ProcedureAdapter(List<Proceduregetset> proceduregetsets, Context context) {
        this.proceduregetsets = proceduregetsets;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.proceduredesign,parent,false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Proceduregetset proceduregetset=proceduregetsets.get(position);
        holder.proce.setText(proceduregetset.getProcedure_name());
        holder.desc.setText(proceduregetset.getDescription());

    }
    @Override
    public int getItemCount() {
        return  proceduregetsets.size();

    }


}






















