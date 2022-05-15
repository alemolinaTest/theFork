package com.amolina.domain.model

import com.google.gson.annotations.SerializedName


data class HighlightedTag(

    @SerializedName("id") var id: Int? = null,
    @SerializedName("slug") var slug: String? = null,
    @SerializedName("indexable") var indexable: Boolean? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("text") var text: String? = null

)