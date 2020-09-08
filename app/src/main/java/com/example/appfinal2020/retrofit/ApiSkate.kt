package com.example.appfinal2020.retrofit

import com.example.appfinal2020.pojo.Skates
import retrofit2.Call
import retrofit2.http.GET


interface ApiSkate {
    @GET("")
    fun getAllSkates(): Call<List<Skates>>
}









