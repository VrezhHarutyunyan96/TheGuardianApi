package com.sololearn.android.network.webservice;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {
    @GET
    Call<Object> get(@Url String url);
}
