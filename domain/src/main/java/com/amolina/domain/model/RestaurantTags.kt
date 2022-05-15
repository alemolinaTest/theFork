package com.amolina.domain.model

import com.amolina.domain.model.tags.*
import com.google.gson.annotations.SerializedName


data class RestaurantTags(

    @SerializedName("restaurant_tags_5") var restaurantTags5: RestaurantTags5? = RestaurantTags5(),
    @SerializedName("restaurant_tags_19") var restaurantTags19: RestaurantTags19? = RestaurantTags19(),
    @SerializedName("restaurant_tags_14") var restaurantTags14: RestaurantTags14? = RestaurantTags14(),
    @SerializedName("restaurant_tags_12") var restaurantTags12: RestaurantTags12? = RestaurantTags12(),
    @SerializedName("restaurant_tags_6") var restaurantTags6: RestaurantTags6? = RestaurantTags6(),
    @SerializedName("restaurant_tags_4") var restaurantTags4: RestaurantTags4? = RestaurantTags4(),
    @SerializedName("restaurant_tags_20") var restaurantTags20: RestaurantTags20? = RestaurantTags20(),
    @SerializedName("restaurant_tags_10") var restaurantTags10: RestaurantTags10? = RestaurantTags10(),
    @SerializedName("restaurant_tags_11") var restaurantTags11: RestaurantTags11? = RestaurantTags11(),
    @SerializedName("restaurant_tags_9") var restaurantTags9: RestaurantTags9? = RestaurantTags9()

)