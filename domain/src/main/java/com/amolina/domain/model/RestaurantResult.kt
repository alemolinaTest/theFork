package com.amolina.domain.model

import com.google.gson.annotations.SerializedName

data class RestaurantResult(
    @SerializedName("data") var data: Data? = Data(),
    @SerializedName("sync") var sync: ArrayList<String> = arrayListOf(),
    @SerializedName("result") var result: Int? = null,
    @SerializedName("result_code") var resultCode: String? = null,
    @SerializedName("result_detail") var resultDetail: String? = null,
    @SerializedName("result_msg") var resultMsg: String? = null,
    @SerializedName("result_cached") var resultCached: String? = null
)
