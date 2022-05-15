package com.amolina.data.model.reppository

import com.amolina.data.model.api.ApiService
import com.amolina.domain.base.ApiResource
import com.amolina.domain.base.BaseApiRestRepository
import com.amolina.domain.model.Data
import com.amolina.domain.model.RestaurantResult
import com.amolina.domain.repository.RestaurantRepository
import javax.inject.Inject

class DataRestaurantRepository @Inject constructor(private var apiService: ApiService) :
    BaseApiRestRepository(), RestaurantRepository {

    override suspend fun getRestaurantData(restaurantId: String): RestaurantResult? {
        val dynamicUrl= "https://api.lafourchette.com/api?%20key=IPHONEPRODEDCRFV&method=restaurant_get_info&id_restaurant="+restaurantId
            var result = getResult {
            apiService.getRestaurantData(
               url = dynamicUrl
            )
        }
        return if (result.status == ApiResource.Status.SUCCESS) {
            result.data
        } else {
            null
        }
    }

}