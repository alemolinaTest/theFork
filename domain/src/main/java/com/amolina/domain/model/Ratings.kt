package com.example.example

import com.google.gson.annotations.SerializedName


data class Ratings(

    @SerializedName("global_rate") var globalRate: String? = null,
    @SerializedName("food_rate") var foodRate: String? = null,
    @SerializedName("service_rate") var serviceRate: String? = null,
    @SerializedName("ambience_rate") var ambienceRate: String? = null,
    @SerializedName("price_rate") var priceRate: String? = null,
    @SerializedName("noice_rate") var noiceRate: String? = null,
    @SerializedName("waiting_rate") var waitingRate: String? = null

)