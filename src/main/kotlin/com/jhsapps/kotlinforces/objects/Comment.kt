package com.jhsapps.kotlinforces.`object`

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Comment(
    val id : Int?,
    val creationTimeSeconds : Int,
    val commentatorHandle : String,
    val locale : String,
    val text : String,
    val parentCommentId : Int?,
    val rating : Int,
)