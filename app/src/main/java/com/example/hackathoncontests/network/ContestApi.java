package com.example.hackathoncontests.network;

import com.example.hackathoncontests.models.ContestResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ContestApi {
@GET("all")
Call<ContestResponse> getCountry(@Query("all") String all);
}
