package com.amolina.domain.model.tags

import com.google.gson.annotations.SerializedName


data class TagList(

    @SerializedName("tag_list_2605") var tagList2605: TagList2605? = TagList2605(),
    @SerializedName("tag_list_2603") var tagList2603: TagList2603? = TagList2603(),
    @SerializedName("tag_list_2032") var tagList2032: TagList2032? = TagList2032()

)