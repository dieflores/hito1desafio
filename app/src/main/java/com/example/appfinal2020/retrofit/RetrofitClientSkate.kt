package com.example.appfinal2020.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClientSkate {


    companion object {
        private const val BASE_URL = "https://www.data.act.gov.au/resource/3np9-m3i7.json"
        fun retrofitInstance(): ApiSkate {
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiSkate::class.java)
        }
    }
}