package com.example.newsapi;

import com.example.newsapi.models.NewsHeadline;

import java.util.List;

public interface OnfetchDataListner <NewsApiResponse>{
    void onFetchData(List<NewsHeadline> list,String message);
    void onError(String msg);

}
