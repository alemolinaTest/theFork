package com.amolina.domain.model

import com.google.gson.annotations.SerializedName


data class PicsDiaporama(

    @SerializedName("612x344") var pd612x344: String? = null,
    @SerializedName("480x270") var pd480x270: String? = null,
    @SerializedName("240x135") var pd240x135: String? = null,
    @SerializedName("664x374") var pd664x374: String? = null,
    @SerializedName("1350x759") var pd1350x759: String? = null,
    @SerializedName("label") var pdlabel: String? = null

)