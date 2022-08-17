package com.example.finalexam.models

import java.util.*


data class ProductModel(
    val products: List<Products>
)

data class Products(
    val id : Int,
    val title : String,
    val description : String,
    val quantity : Int,
    val price : Int,
    val categoryId : Int,
    val userId : Int,
    val status : String,
    val productImgs : List<ProductImgs>
)

data class ProductImgs(
    val id : Int,
    val imgUrl : String,
    val productId : Int,
    val status : String,
    val createdAt : Date,
    val updatedAt : Date
)
