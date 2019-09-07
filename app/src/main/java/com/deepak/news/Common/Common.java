package com.deepak.news.Common;

import com.deepak.news.Interface.NewsService;
import com.deepak.news.remote.RetrofitClient;

public class Common {
    private static final String BASE_URL="https://newsapi.org";
    public static final String API_KEY="428610ca77c445b28100f026c2315f71";
    public static NewsService getNewsService(){
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);

    }
}
