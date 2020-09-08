package com.example.appfinal2020.pojo

import androidx.annotation.NonNull
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "skates_table")
data class Skates(@SerializedName("id") val id : String,
                  @SerializedName("division") val division : String,
                  @SerializedName("location") val location : String,
                  @SerializedName("latitude") val latitude : Double,
                  @SerializedName("longitude") val longitude : Double,
                  @Embedded(prefix = "location_1") val location_1 : Location_1,
             //     @SerializedName(":@computed_region_h8vr_r9vc") val :@computed_region_h8vr_r9vc : Int
)

data class Location_1(val latitude: Double?,
                      val longitude: Double?)


// data class computed_region_h8vr_r9vc(val computed_region_h8vr_r9vc: Int)