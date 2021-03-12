package com.jhsapps.kotlinforces.`object`

data class BlogEntry(
    val id : Int,
    val originalLocal : String,
    val creationTimeSeconds : Int,
    val authorHandle : String,
    val title : String,
    val content : String,
    val locale : String,
    val modificationTimeSeconds : Int,
    val allowViewHistory : Boolean,
    val tags : List<String>,
    val rating : Int,
)