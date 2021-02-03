package com.atixiansoftware.samadhan.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.atixiansoftware.samadhan.Model.Indoorgetset;
import com.atixiansoftware.samadhan.Model.Projectgetset;
import com.atixiansoftware.samadhan.R;

import java.util.List;


public class IndoorAdapter extends RecyclerView.Adapter<IndoorAdapter.ViewHolder> {
    List<Indoorgetset> indoorgetsets;
    Context context;
    public static final String SHARED_PREF_NAME = "myloginapp";

    public  class ViewHolder extends RecyclerView.ViewHolder{
        final TextView prname,desc,std,end,challan,amt,active;

        public ViewHolder(View itemView) {
            super(itemView);
            prname=itemView.findViewById(R.id.prg);
            desc=itemView.findViewById(R.id.prg6);
            std=itemView.findViewById(R.id.prg3);
            end=itemView.findViewById(R.id.prg4);
            challan=itemView.findViewById(R.id.prg5);
            amt=itemView.findViewById(R.id.prg8);
            active=itemView.findViewById(R.id.prg7);


        }
    }


    public IndoorAdapter(List<Indoorgetset> indoorgetsets, Context context) {
        this.indoorgetsets = indoorgetsets;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.indoor_design,parent,false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Indoorgetset indoorgetset=indoorgetsets.get(position);
        holder.prname.setText(indoorgetset.getProject_file_id());
        holder.desc.setText(indoorgetset.getProvision());
        holder.std.setText(indoorgetset.getStart_date());
        holder.end.setText(indoorgetset.getEnd_date());
        holder.challan.setText(indoorgetset.getChalan_no());
        holder.amt.setText(indoorgetset.getAmount());
        holder.active.setText(indoorgetset.getIs_active());

    }
    @Override
    public int getItemCount() {
        return  indoorgetsets.size();

    }


}

















