package com.example.retrofitproekt

import retrofit2.Call
import retrofit2.http.GET


interface UserApi {
   @GET("public-api/products/2")
    fun getUserApi(): Call<UserModel>

}