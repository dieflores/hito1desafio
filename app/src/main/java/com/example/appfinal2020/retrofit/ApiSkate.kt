package com.example.appfinal2020.retrofit

import com.example.appfinal2020.pojo.Skates
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers


interface ApiSkate {
    @GET("")
    @Headers ("x-rapidapi-host: mashape-community-skate-ipsum.p.rapidapi.com",
        "x-rapidapi-key: 296874df5fmshd03d65d1b870d9fp1152abjsn3bbe6f1e5d7d")
    fun getAllSkates(): Call<List<Skates>>
}









