package com.example.totoandriparsingjson.model

import com.google.gson.annotations.SerializedName

data class ResponUser(
        @field:SerializedName("Page")
        val Page: Int? = null,

        @field:SerializedName("Per_Page")
        val Per_Page: Int? = null,

        @field:SerializedName("Total_Page")
        val Total_Page: Int? = null,

        @field:SerializedName("Data")
        val Data: List<DataItem>?= null
)
