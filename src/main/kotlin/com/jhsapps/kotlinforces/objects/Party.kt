package com.jhsapps.kotlinforces.`object`

data class Party(
    val contestId : Int?,
    val members : List<Member>,
    val participantType : ParticipantType,
    val teamId : Int?,
    val teamName : String?,
    val ghost : Boolean,
    val room : Int?,
    val startTimeSeconds : Int?,
){
    enum class ParticipantType {
        CONTESTANT,
        PRACTICE,
        VIRTUAL,
        MANAGER,
        OUT_OF_COMPETITION
    }

    data class Member(
        val handle : String
    )
}
