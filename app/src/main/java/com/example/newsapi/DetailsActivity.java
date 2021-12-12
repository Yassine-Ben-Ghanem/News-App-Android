package com.example.newsapi;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newsapi.models.NewsHeadline;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    NewsHeadline headline;
    TextView txt_title, txt_author, txt_time, txt_content, txt_detail;
    ImageView img_news;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txt_author = findViewById(R.id.text_detail_author);
        txt_detail = findViewById(R.id.text_detail_detail);
        txt_content = findViewById(R.id.text_detail_content);
        txt_time = findViewById(R.id.text_detail_time);
        txt_title = findViewById(R.id.text_detail_title);
        img_news = findViewById(R.id.img_detail_news);

        headline = (NewsHeadline) getIntent().getSerializableExtra("data");

        txt_title.setText(headline.getTitle());
        txt_author.setText(headline.getAuthor());
        txt_time.setText(headline.getPublishedAt());
        txt_detail.setText(headline.getDescription());
        txt_content.setText(headline.getContent());
        Picasso.get().load(headline.getUrlToImage()).into(img_news);

    }
}