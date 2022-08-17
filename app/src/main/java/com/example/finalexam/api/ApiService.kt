package com.example.finalexam.api

import com.example.finalexam.models.ProductModel
import com.example.finalexam.models.UserModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("products")
    fun getProducts(): Call<ProductModel>

    @POST("/signup")
    fun signUp(): Call<UserModel>
}