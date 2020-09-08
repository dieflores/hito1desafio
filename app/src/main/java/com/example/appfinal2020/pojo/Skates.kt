package com.example.appfinal2020.pojo

import androidx.annotation.NonNull
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "skates_table")
data class Skates(
    @PrimaryKey(autoGenerate = true) @NonNull val id: String,
    val division: String,
    val location: String,
    @Embedded var image_link: SkateParkImage
)

data class SkateParkImage(val url: String)
