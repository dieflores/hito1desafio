package com.example.appfinal2020.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.appfinal2020.pojo.Skates

@Dao
interface SkateDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun   insertAllSkates(listSkates: List<Skates>)


    //Traer los elementos de la tabla
    @Query("SELECT * FROM skates_table ORDER BY skateid DESC")
    fun getAllSuperHeroesList(): LiveData<List<Skates>>
}

