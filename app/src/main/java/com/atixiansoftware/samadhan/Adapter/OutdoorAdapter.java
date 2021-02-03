package com.atixiansoftware.samadhan.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.atixiansoftware.samadhan.Model.Indoorgetset;
import com.atixiansoftware.samadhan.Model.Outdoorgetset;
import com.atixiansoftware.samadhan.Model.Projectgetset;
import com.atixiansoftware.samadhan.R;

import java.util.List;


public class OutdoorAdapter extends RecyclerView.Adapter<OutdoorAdapter.ViewHolder> {
    List<Outdoorgetset> outdoorgetsets;
    Context context;
    public static final String SHARED_PREF_NAME = "myloginapp";

    public  class ViewHolder extends RecyclerView.ViewHolder{
        final TextView prname,venid,desc,std,end,challan,amt,active;

        public ViewHolder(View itemView) {
            super(itemView);
            prname=itemView.findViewById(R.id.prg);
            venid=itemView.findViewById(R.id.prg6);
            desc=itemView.findViewById(R.id.prg3);
            std=itemView.findViewById(R.id.prg4);
            end=itemView.findViewById(R.id.prg5);
            challan=itemView.findViewById(R.id.prg8);
            amt=itemView.findViewById(R.id.prg9);
            active=itemView.findViewById(R.id.prg7);


        }
    }


    public OutdoorAdapter(List<Outdoorgetset> outdoorgetsets, Context context) {
        this.outdoorgetsets = outdoorgetsets;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.outdoor_design,parent,false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Outdoorgetset outdoorgetset=outdoorgetsets.get(position);
        holder.prname.setText(outdoorgetset.getProject_file_id());
        holder.venid.setText(outdoorgetset.getVendor_id());
        holder.desc.setText(outdoorgetset.getProvision());
        holder.std.setText(outdoorgetset.getStart_date());
        holder.end.setText(outdoorgetset.getEnd_date());
        holder.challan.setText(outdoorgetset.getChalan_no());
        holder.amt.setText(outdoorgetset.getAmount());
        holder.active.setText(outdoorgetset.getIs_active());

    }
    @Override
    public int getItemCount() {
        return  outdoorgetsets.size();

    }


}

















