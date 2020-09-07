package com.example.appfinal2020.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "skates_table")
data class Skates(
    @SerializedName("")
    @PrimaryKey(autoGenerate = true) val skateid: Int) {
}