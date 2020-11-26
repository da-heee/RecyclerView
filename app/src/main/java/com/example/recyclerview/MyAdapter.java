package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context; // mainactivity 에서 가져올 때 필요
    String[] title; // mainactivity 에 있는  String [] 가져와야하니까
    String[] description;
    int[] icon;

    // Constructor
    public MyAdapter (Context context, String[] title, String[] description, int[] icon){
        this.context = context;
        this.title = title;
        this.description = description;
        this.icon = icon;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.itemview, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(title[position]);
        holder.description.setText(title[position]);
        holder.icon.setImageResource(icon[position]);

    }

    @Override
    public int getItemCount() { // item 개수 알려줌
        return title.length; // title 개수가 item 개수랑 같으니까
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {//alt shift enter

        TextView title;
        TextView description;
        ImageView icon; // itemview.xml 에 있는 property

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.TV_TitleHere);
            description = itemView.findViewById(R.id.TV_DesHere);
            icon = itemView.findViewById(R.id.IV_IconHere);
        }
    }
}
