package com.example.justtry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<Model> mList;
    Context context;

    public Adapter(Context context, ArrayList<Model> mList){
        this.mList = mList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.date.setText(mList.get(position).getDate());
        holder.question.setText(mList.get(position).getQuestion());
        holder.title.setText(mList.get(position).getTitle());
        holder.topic.setText(mList.get(position).getTopic());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView date, question, title, topic;
        public ViewHolder(View itemView){
            super(itemView);
            date = itemView.findViewById(R.id.date);
            question = itemView.findViewById(R.id.question);
            title = itemView.findViewById(R.id.title);
            topic = itemView.findViewById(R.id.topic);
        }
    }
}
