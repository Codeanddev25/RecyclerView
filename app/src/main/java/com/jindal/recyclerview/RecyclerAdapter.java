package com.jindal.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private ArrayList<User> userList;

    public RecyclerAdapter(ArrayList<User> userList) {
        this.userList = userList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nametxt;

        public MyViewHolder(final View view){
            super(view);
            nametxt = view.findViewById(R.id.textView2);
        }
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        String name = userList.get(position).getUsername();
        holder.nametxt.setText(name);
    }


    @Override
    public int getItemCount() {
        return userList.size();
    }
}
