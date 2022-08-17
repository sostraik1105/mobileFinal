package com.example.finalexam.models

data class LoginDto(
    val user : String,
    val password : String
)

data class UserDto(
    val username: String,
    val email: String,
    val password: String
)
