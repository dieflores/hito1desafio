package com.example.appfinal2020

import android.content.Context
import com.example.appfinal2020.database.RoomDataBaseSkates


class RepositorySkates(context: Context) {
    private val dataBase: RoomDataBaseSkates = RoomDataBaseSkates.getDatabase(context)
    private val skatesList = dataBase.getSkatesDao().getAllSkatesList()
    private val tag = "Skates Repository"



}
