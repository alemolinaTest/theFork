package com.amolina.domain.repository

import com.amolina.domain.model.Data
import com.amolina.domain.model.RestaurantResult

interface RestaurantRepository {

    suspend fun getRestaurantData(restaurantId: String): RestaurantResult?
}