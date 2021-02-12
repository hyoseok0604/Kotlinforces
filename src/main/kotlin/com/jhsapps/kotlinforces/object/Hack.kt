package com.jhsapps.kotlinforces.`object`

data class Hack(
    val id : Int,
    val creationTimeSeconds : Int,
    val hacker : Party,
    val defender : Party,
    val verdict : Verdict?,
    val problem : Problem,
    val test : String,
    val judgeProtocol : JudgeProtocol?,
){
    enum class Verdict {
        HACK_SUCCESSFUL,
        HACK_UNSUCCESSFUL,
        INVALID_INPUT,
        GENERATOR_INCOMPILABLE,
        GENERATOR_CRASHED,
        IGNORED,
        TESTING,
        OTHER
    }

    data class JudgeProtocol(
        val protocol : String,
        val manual : String,
        val verdict : String,
    )
}
