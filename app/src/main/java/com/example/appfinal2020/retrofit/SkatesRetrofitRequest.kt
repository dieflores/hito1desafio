package com.example.appfinal2020.retrofit

import com.example.appfinal2020.pojo.Skates
import retrofit2.Call
import retrofit2.Callback

class SkatesRetrofitRequest {

    private var requestApiSkate: ApiSkate

    init {
        requestApiSkate = RetrofitClientSkate.getRetrofitInstance()
            .create(ApiSkate::class.java)
    }

    fun getSkatesListFromApi(callB: Callback<MutableList<Skates>>) {
        var call: Call<MutableList<Skates>> = requestApiSkate.getAllSkates()
            call.enqueue(callB)
    }
}