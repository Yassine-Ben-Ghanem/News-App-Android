package com.example.newsapi;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomerViewHolder extends RecyclerView.ViewHolder {
    TextView Text_title,Text_source;
    ImageView img_headline;
    CardView cardView;
    public CustomerViewHolder(@NonNull View itemView) {
        super(itemView);
        Text_title= itemView.findViewById(R.id.text_title);
        Text_source=itemView.findViewById(R.id.text_source);
        img_headline=itemView.findViewById(R.id.img_headline);
        cardView=itemView.findViewById(R.id.main_container);
    }
}
