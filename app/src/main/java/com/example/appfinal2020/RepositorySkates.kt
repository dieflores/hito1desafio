package com.example.appfinal2020

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import com.example.appfinal2020.database.RoomDataBaseSkates
import com.example.appfinal2020.pojo.Skates
import com.example.appfinal2020.retrofit.ApiSkate
import com.example.appfinal2020.retrofit.RetrofitClientSkate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RepositorySkates(context: Context) {

    @InternalCoroutinesApi
    private val dataBaseSK: RoomDataBaseSkates = RoomDataBaseSkates
        .getDatabase(context)

    @InternalCoroutinesApi
    private val skatesList = dataBaseSK.getSkateDao().getAllSkatesList()
    private val tag = "Skates Repository"

    @InternalCoroutinesApi
    fun getListFromRepository(): LiveData<List<Skates>> {
        return skatesList
    }

    @InternalCoroutinesApi
    fun fetchDataFromServer() {
        val service: ApiSkate = RetrofitClientSkate.retrofitInstance()
        val call: retrofit2.Call<List<Skates>> = service.getAllSkates()

        call.enqueue(object : Callback<List<Skates>> {
            override fun onResponse(
                call: Call<List<Skates>>,
                response: Response<List<Skates>>
            ) {

                CoroutineScope(Dispatchers.IO).launch { response.body()?.let {
                    dataBaseSK.getSkateDao()
                        .insertAllSkates(it)
                } }

            }

            override fun onFailure(call: Call<List<Skates>>, t: Throwable) {


            }

        })
    }

}