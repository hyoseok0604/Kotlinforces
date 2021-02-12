package com.jhsapps.kotlinforces.`object`

data class RatingChange(
    val contestId : Int,
    val contestName : String,
    val handle : String,
    val rank : Int,
    val ratingUpdateTimeSeconds : Int,
    val oldRating : Int,
    val newRating : Int,
)