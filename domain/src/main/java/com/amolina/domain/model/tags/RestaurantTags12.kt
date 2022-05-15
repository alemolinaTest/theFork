package com.amolina.domain.model.tags

import com.google.gson.annotations.SerializedName


data class RestaurantTags12(

    @SerializedName("tag_list") var tagList: TagList? = TagList(),
    @SerializedName("id_restaurant_tag_category") var idRestaurantTagCategory: Int? = null,
    @SerializedName("category_name") var categoryName: String? = null,
    @SerializedName("category_pic") var categoryPic: String? = null

)