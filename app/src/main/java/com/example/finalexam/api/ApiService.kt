package com.example.finalexam.api

import com.example.finalexam.models.ProductModel
import com.example.finalexam.models.LoginDto
import com.example.finalexam.models.UserDto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("products")
    fun getProducts(): Call<ProductModel>

    @POST("signup")
    fun signup(@Body login: UserDto): Call<UserDto>

    @POST("login")
    fun login(@Body login: LoginDto): Call<LoginDto>
}