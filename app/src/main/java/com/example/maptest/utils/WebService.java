package com.example.maptest.utils;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebService {

    @GET("i.php")
    Call<String> sendData(
            @Query("a") String client_id,
            @Query("b") String fleet_id,
            @Query("c") double latitude,
            @Query("d") double longitude,
            @Query("e") String time, // HH:MM:SS
            @Query("f") String date //MM/DD/YYYY
    );
}
