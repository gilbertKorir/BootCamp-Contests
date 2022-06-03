package com.example.hackathoncontests.network;

import com.example.hackathoncontests.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ContestClient {
    private static Retrofit retrofit = null;

    public static ContestApi getClient() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.CONTEST_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ContestApi.class);
    }
}
