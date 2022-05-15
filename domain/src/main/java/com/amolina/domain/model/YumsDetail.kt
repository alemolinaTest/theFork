package com.amolina.domain.model

import com.google.gson.annotations.SerializedName


data class YumsDetail(

    @SerializedName("is_super_yums") var isSuperYums: Boolean? = null,
    @SerializedName("yums_count") var yumsCount: Int? = null

)