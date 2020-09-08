package com.example.appfinal2020.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.appfinal2020.pojo.Skates


@Database(entities = [Skates::class], version = 1, exportSchema = false)
abstract class RoomDataBaseSkates : RoomDatabase() {

    abstract fun getSkatesDao(): SkateDao

    companion object {
        @Volatile
        private var INSTANCE: RoomDataBaseSkates? = null

        fun getDatabase(context: Context): RoomDataBaseSkates {
            val tempInstance: RoomDataBaseSkates? = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance :RoomDataBaseSkates = Room.databaseBuilder(
                    context.applicationContext,
                    RoomDataBaseSkates::class.java,
                    "superHero_database"
                ).build()
                INSTANCE = instance
                return instance
            }

        }
    }
}


/*  // esta forma la saque de prueba kotlin
   abstract fun getSkateDao(): SkateDao

   companion object{
       private var nDatabaseSkate: RoomDataBaseSkates? = null
       private const val DB_NAME = "Skate_Park"

       @InternalCoroutinesApi
       fun getnDatabaseSkate(context: Context):RoomDataBaseSkates{
           if(nDatabaseSkate == null)
               synchronized(this){
                   nDatabaseSkate = Room.databaseBuilder(context, RoomDataBaseSkates::class.java,
                       DB_NAME).build()
               }
           return nDatabaseSkate!!
       }
   }


   //ESTA FORMA LA SAQUE DE PRUEBA SUPER HEROES */