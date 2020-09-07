package com.example.appfinal2020.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClientSkate {


    companion object{
        private const val BASE_URL = "https://mashape-community-skate-ipsum.p.rapidapi.com/3/1/JSON"
        fun retrofitInstance(): ApiSkate {
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return  retrofitInstance()
        }
    }
}