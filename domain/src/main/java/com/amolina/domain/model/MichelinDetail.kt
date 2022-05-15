package com.amolina.domain.model

import com.google.gson.annotations.SerializedName


data class MichelinDetail(

    @SerializedName("is_michelin") var isMichelin: Boolean? = null

)