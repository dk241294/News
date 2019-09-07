package com.deepak.news.Interface;

import com.deepak.news.model.Website;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {
    @GET("v2/sources?language=en")
    Call<Website>getSources();
}
