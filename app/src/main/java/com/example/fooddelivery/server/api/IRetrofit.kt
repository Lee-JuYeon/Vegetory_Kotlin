package com.example.fooddelivery.server.api

import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IRetrofit {
    // https://www.unsplash.com/ search/photos  /?query=""
    @GET(API.ADDRESS_QUERY)
    fun searchAddress(@Query("query") search : String) : Call<JsonElement>
}