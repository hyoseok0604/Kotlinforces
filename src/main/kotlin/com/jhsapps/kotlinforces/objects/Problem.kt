package com.jhsapps.kotlinforces.`object`

data class Problem(
    val contestId : Int?,
    val problemsetName : String?,
    val index : String,
    val name : String,
    val type : Type,
    val points : Double?,
    val rating : Int?,
    val tags : List<String>,
){
    enum class Type {
        PROGRAMMING,
        QUESTION
    }
}