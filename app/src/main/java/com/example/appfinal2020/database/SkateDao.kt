package com.example.appfinal2020.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.appfinal2020.pojo.Skates

@Dao
interface SkateDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun   insertAllSkates(listSkates: List<Skates>)
}