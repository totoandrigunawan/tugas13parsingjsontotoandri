package com.example.totoandriparsingjson.network

import com.example.totoandriparsingjson.model.ResponUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Apiservice {
    //Menampilkan user dengan query
    @GET("api/user")
    fun getListUsers(@Query("page")page: String): Call<ResponUser>
}