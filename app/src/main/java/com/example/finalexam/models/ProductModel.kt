package com.example.finalexam.models

import okhttp3.Interceptor

data class ProductModel(
    val title : Int? = null,
    val description : String? = null,
    val quantity : Int? = null,
    val price : Int? = null,
    val categoryId : Int? = null,
    val userId : Int? = null,
    val status : String? = null,
    val productImgs : ArrayList<ProductImgs>? = null
)
