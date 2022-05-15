package com.amolina.domain.model

import com.google.gson.annotations.SerializedName


data class PicsMain(

    @SerializedName("612x344") var p612x344: String? = null,
    @SerializedName("480x270") var p480x270: String? = null,
    @SerializedName("240x135") var p240x135: String? = null,
    @SerializedName("664x374") var p664x374: String? = null,
    @SerializedName("1350x759") var p1350x759: String? = null,
    @SerializedName("160x120") var p160x120: String? = null,
    @SerializedName("80x60") var p80x60: String? = null,
    @SerializedName("92x92") var p92x92: String? = null,
    @SerializedName("184x184") var p184x184: String? = null

)