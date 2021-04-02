package com.example.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class MydataAdapter extends RecyclerView.Adapter<MydataAdapter.MyViewHolder> {
Context cx;
String[] uname,umailId,uphone,urolls;



 public MydataAdapter(MainActivity mainActivity, String[] names, String[] rolls, String[] phone, String[] mailId) {
        cx=mainActivity;
        uname=names;
        umailId=mailId;
        uphone=phone;
        urolls=rolls;
    }

    @NonNull
    @Override
    public MydataAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(cx).inflate(R.layout.design,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MydataAdapter.MyViewHolder holder, int position) {
        holder.tv1.setText(uname[position]);
        holder.tv2.setText(urolls[position]);
        holder.tv3.setText(uphone[position]);
        holder.tv4.setText(umailId[position]);

    }

    @Override
    public int getItemCount() {
        return uname.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1,tv2,tv3,tv4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.names);
            tv2=itemView.findViewById(R.id.rolls);
            tv3=itemView.findViewById(R.id.phone);
            tv4=itemView.findViewById(R.id.mailId);
        }
    }
}
