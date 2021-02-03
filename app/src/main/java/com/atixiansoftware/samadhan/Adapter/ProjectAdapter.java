package com.atixiansoftware.samadhan.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.atixiansoftware.samadhan.Model.Projectgetset;
import com.atixiansoftware.samadhan.R;

import java.util.List;


public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ViewHolder> {
    List<Projectgetset> projectgetsets;
    Context context;
    public static final String SHARED_PREF_NAME = "myloginapp";

    public  class ViewHolder extends RecyclerView.ViewHolder{
        final TextView prname,cstname,whatno,add,ema,std,end;

        public ViewHolder(View itemView) {
            super(itemView);
            prname=itemView.findViewById(R.id.prg);
            cstname=itemView.findViewById(R.id.prg6);
            whatno=itemView.findViewById(R.id.prg3);
            add=itemView.findViewById(R.id.prg4);
            ema=itemView.findViewById(R.id.prg5);
            std=itemView.findViewById(R.id.prg8);
            end=itemView.findViewById(R.id.prg7);


        }
    }


    public ProjectAdapter(List<Projectgetset> projectgetsets, Context context) {
        this.projectgetsets = projectgetsets;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.projectdesign,parent,false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Projectgetset projectgetset=projectgetsets.get(position);
        holder.prname.setText(projectgetset.getProject_name());
        holder.cstname.setText(projectgetset.getCustomer_name());
        holder.whatno.setText(projectgetset.getWhatsapp_number());
        holder.add.setText(projectgetset.getAddress());
        holder.ema.setText(projectgetset.getEmail());
        holder.std.setText(projectgetset.getProject_start_date());
        holder.end.setText(projectgetset.getProject_end_date());

    }
    @Override
    public int getItemCount() {
        return  projectgetsets.size();

    }


}
























//
//public class NewProjectAdapter extends RecyclerView.Adapter<NewProjectAdapter.MyViewHolder> implements Filterable {
//
//    List<User> user, userFilter;
//    private Context context;
//    private RecyclerViewClickListener mListener;
//    CustomFilter filter;
//
//    public NewProjectAdapter(List<User> user, Context context, RecyclerViewClickListener listener) {
//        this.user = user;
//        this.userFilter = user;
//        this.context = context;
//        this.mListener = listener;
//    }
//
//    @Override
//    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate( R.layout.display_newproject, parent, false);
//        return new MyViewHolder(view, mListener);
//    }
//
//    @SuppressLint("CheckResult")
//    @Override
//    public void onBindViewHolder(final MyViewHolder holder, int position) {
//
//        holder.pn.setText(user.get(position).getProject_name());
//        holder.pr.setText(user.get(position).getProcedure_name());
//        holder.pa.setText(user.get(position).getPart_name());
//        holder.d.setText(user.get(position).getDescription());
//        holder.c.setText(user.get(position).getChalan_no());
//        holder.a.setText(user.get(position).getProject_start_date());
//        holder.e.setText(user.get(position).getProject_end_date());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return user.size();
//    }
//
//    @Override
//    public Filter getFilter() {
//        if (filter==null) {
//            filter=new CustomFilter((ArrayList<User>) userFilter,this);
//
//        }
//        return filter;
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//
//        private RecyclerViewClickListener mListener;
//
//
//        private TextView pn, pr, pa,d,c,a,s,e;
//        private RelativeLayout mRowContainer;
//
//        public MyViewHolder(View itemView, RecyclerViewClickListener listener) {
//            super(itemView);
//
//            pn = itemView.findViewById(R.id.ps);
//            pr = itemView.findViewById(R.id.parts);
//            pa=itemView.findViewById( R.id.qty );
//            d=itemView.findViewById( R.id.am );
//            c = itemView.findViewById(R.id.chalan);
//           a=itemView.findViewById( R.id.amount);
//            s=itemView.findViewById( R.id.a );
//            e=itemView.findViewById( R.id.e);
//            mRowContainer = itemView.findViewById(R.id.row_container);
//
//            mListener = listener;
//            mRowContainer.setOnClickListener(this);
//
//        }
//
//        @Override
//        public void onClick(View v) {
//            switch (v.getId()) {
//                case R.id.row_container:
//                    mListener.onRowClick(mRowContainer, getAdapterPosition());
//                    break;
//
//                default:
//                    break;
//            }
//        }
//    }
//
//    public interface RecyclerViewClickListener {
//        void onRowClick(View view, int position);
//
//    }
//
//}