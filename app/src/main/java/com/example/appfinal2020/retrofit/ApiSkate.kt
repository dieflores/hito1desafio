package com.example.appfinal2020.retrofit

import com.example.appfinal2020.pojo.Skates
import retrofit2.Call
import retrofit2.http.*


interface ApiSkate {
    @GET("")
    fun getAllSkates(): Call<MutableList<Skates>>

    @DELETE("")
    fun deleteSuperHero(@Path("") heroId: Int?): Call<Void>

    @POST("")
    fun createNewHero(@Body skates: Skates): Call<Skates>
}








