package com.example.appfinal2020.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.appfinal2020.pojo.Skates
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized


@Database(entities = [Skates::class], version = 1, exportSchema = false)
abstract class RoomDataBaseSkates : RoomDatabase() {

    abstract fun getSkateDao(): SkateDao

    companion object{
        @Volatile
        private var INSTANCE: RoomDataBaseSkates? = null

        @InternalCoroutinesApi
        fun getDatabase(context: Context): RoomDataBaseSkates{
            val tempInstance: RoomDataBaseSkates? = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance :RoomDataBaseSkates = Room.databaseBuilder(
                    context.applicationContext,
                    RoomDataBaseSkates::class.java,
                    "Skates_database")
                    .build()
                INSTANCE = instance
                return  instance

            }

        }
    }
}