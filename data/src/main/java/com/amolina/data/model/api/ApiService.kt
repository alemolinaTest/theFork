package com.amolina.data.model.api

import com.amolina.domain.model.Data
import com.amolina.domain.model.RestaurantResult
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url


interface ApiService {

    @GET()
    suspend fun getRestaurantData(
        @Url url: String
    ): Response<RestaurantResult>

}