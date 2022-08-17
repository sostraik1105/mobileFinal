package com.example.finalexam.api

import com.example.finalexam.models.ProductModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/products")
    fun getProducts(): Call<List<ProductModel>>
}