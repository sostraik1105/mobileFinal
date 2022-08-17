package com.example.finalexam.api

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor:Interceptor {
    var token = "";
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("Authorization", "Bearer ${token}")
            .build()

        return chain.proceed(request)
    }
}