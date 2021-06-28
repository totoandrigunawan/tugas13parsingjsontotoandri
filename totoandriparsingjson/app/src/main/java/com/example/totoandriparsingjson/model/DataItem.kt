package com.example.totoandriparsingjson.model

import com.google.gson.annotations.SerializedName

data class DataItem(
        @field:SerializedName("Id")
        val Id: Int? = null,

        @field:SerializedName("Email")
        val Email: String? = null,

        @field:SerializedName("First_Name")
        val FirstName: String? = null,

        @field:SerializedName("Last_Name")
        val LastName: String? = null,

        @field:SerializedName("Avatar")
        val Avatar: String? = null
)

