package com.amolina.domain.model.tags

import com.google.gson.annotations.SerializedName


data class TagList2(

    @SerializedName("slug_list") var slugList: ArrayList<String> = arrayListOf(),
    @SerializedName("id_restaurant_tag") var idRestaurantTag: Int? = null,
    @SerializedName("id_restaurant_tag_category") var idRestaurantTagCategory: Int? = null,
    @SerializedName("tag_name") var tagName: String? = null,
    @SerializedName("pic_small") var picSmall: String? = null,
    @SerializedName("pic_large") var picLarge: String? = null,
    @SerializedName("pic_mobile") var picMobile: String? = null,
    @SerializedName("banner_web") var bannerWeb: String? = null,
    @SerializedName("indexable") var indexable: Int? = null,
    @SerializedName("tag_description") var tagDescription: String? = null,
    @SerializedName("slug_indexable") var slugIndexable: String? = null,
    @SerializedName("id_city_indexable") var idCityIndexable: String? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("seo_title") var seoTitle: String? = null,
    @SerializedName("seo_desc") var seoDesc: String? = null,
    @SerializedName("seo_h1") var seoH1: String? = null,
    @SerializedName("id_restaurant_tag_substitute") var idRestaurantTagSubstitute: String? = null,
    @SerializedName("is_deleted") var isDeleted: Int? = null,
    @SerializedName("display_order") var displayOrder: Int? = null,
    @SerializedName("is_displayed_search") var isDisplayedSearch: Boolean? = null,
    @SerializedName("search_volume") var searchVolume: Int? = null,
    @SerializedName("is_published_portal") var isPublishedPortal: Boolean? = null,
    @SerializedName("marketing_banner") var marketingBanner: String? = null,
    @SerializedName("marketing_title") var marketingTitle: String? = null,
    @SerializedName("marketing_description") var marketingDescription: String? = null,
    @SerializedName("id_restaurant_tag_level_1") var idRestaurantTagLevel1: String? = null,
    @SerializedName("id_restaurant_tag_level_2") var idRestaurantTagLevel2: String? = null,
    @SerializedName("alternative_name_hp") var alternativeNameHp: String? = null,
    @SerializedName("alternative_name_srp") var alternativeNameSrp: String? = null,
    @SerializedName("alternative_name_rp") var alternativeNameRp: String? = null,
    @SerializedName("alternative_names") var alternativeNames: String? = null,
    @SerializedName("id_country_restriction") var idCountryRestriction: String? = null,
    @SerializedName("admin_mode") var adminMode: String? = null

)