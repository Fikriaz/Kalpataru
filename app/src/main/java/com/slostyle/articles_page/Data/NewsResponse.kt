package com.slostyle.articles_page.Data

import com.google.gson.annotations.SerializedName

data class NewsResponse(
    val articles : List<Article>?=null
)

data class Article(
    var title : String,
    var source : Source,
    var url : String,
    @SerializedName("urlToImage")
    var imageUrl : String,
)
data class Source(
    val id: String?,
    val name: String
)