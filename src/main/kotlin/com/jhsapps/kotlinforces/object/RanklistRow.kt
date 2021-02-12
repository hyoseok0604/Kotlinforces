package com.jhsapps.kotlinforces.`object`

data class RanklistRow(
    val party : Party,
    val rank : Int,
    val points : Double,
    val penalty : Int,
    val successfulHackCount : Int,
    val unsuccessfulHackCount : Int,
    val problemResults : List<ProblemResult>,
    val lastSubmissionTimeSeconds : Int?,
){
    data class ProblemResult(
        val points : Double,
        val penalty : Int,
        val rejectedAttemptCount : Int,
        val type : Type,
        val bestSubmissionTimeSeconds : Int,
    ){
        enum class Type {
            PRELIMINARY,
            FINAL
        }
    }
}
