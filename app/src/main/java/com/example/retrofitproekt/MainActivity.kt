package com.example.retrofitproekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val call = UserRetroService.retrofit.create(UserApi::class.java).getUserApi()
        val response = call.execute().body()?.data?.name
        val description_response = call.execute().body()?.data?.description
        val id_response = call.execute().body()?.data?.id
        val price_response = call.execute().body()?.data?.price
        val  discount_amount_response = call.execute().body()?.data?.discount_amount
        val name = findViewById<TextView>(R.id.name)
        val description = findViewById<TextView>(R.id.description)
        val id = findViewById<TextView>(R.id.id)
        val price = findViewById<TextView>(R.id.price)
        val  discount_amount= findViewById<TextView>(R.id.discount_amount)





        name.text = response
        description.text = description_response
        id.text = id_response.toString()
        price.text = price_response
        discount_amount.text = discount_amount_response





    }
}