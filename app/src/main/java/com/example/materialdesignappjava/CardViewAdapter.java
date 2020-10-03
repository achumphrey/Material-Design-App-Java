package com.example.materialdesignappjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {

    private Context context;
    private ArrayList<LanguageModel> data;

    public CardViewAdapter(Context context, ArrayList<LanguageModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.cardview,
                        parent,
                        false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(data.get(position).getName());
        holder.imageView.setImageResource(data.get(position).getImageResource());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tvTitle);
            imageView = itemView.findViewById(R.id.imageIcon);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
