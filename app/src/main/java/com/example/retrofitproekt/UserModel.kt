package com.example.retrofitproekt


import com.google.gson.annotations.SerializedName
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserModel {

    var data:UserData?=null
    data class UserData(  @SerializedName("name")
                          val name:String,
                          @SerializedName("description")
                          val description:String,
                          @SerializedName("id")
                          val id:Int,
                          @SerializedName("price")
                          val price:String,
                          @SerializedName("discount_amount")
                          val discount_amount:String)
}

object UserRetroService{
    val retrofit=Retrofit.Builder()
        .baseUrl("https://gorest.co.in/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}