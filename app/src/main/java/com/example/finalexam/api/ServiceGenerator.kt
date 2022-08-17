package com.example.finalexam.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceGenerator {
    private val client = OkHttpClient
        .Builder()
        .build()

    public val retrofit = Retrofit.Builder()
        .baseUrl("https://ecommerce-puchuri.herokuapp.com/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun <T> buildService(serviceClass: Class<T>): T {
        return retrofit.create(serviceClass);
    }
}