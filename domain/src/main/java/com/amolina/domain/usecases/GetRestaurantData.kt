package com.amolina.domain.usecases

import com.amolina.domain.model.Data
import com.amolina.domain.model.RestaurantResult
import com.amolina.domain.repository.RestaurantRepository
import javax.inject.Inject

class GetRestaurantData @Inject constructor(private val restaurantRepository: RestaurantRepository) {

    suspend fun invoke(restaurantId: String): RestaurantResult? {
        return restaurantRepository.getRestaurantData(restaurantId = restaurantId)
    }
}