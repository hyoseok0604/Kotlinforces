package com.jhsapps.kotlinforces.`object`

data class Submission(
    val id : Int,
    val contestId : Int?,
    val creationTimeSeconds : Int,
    val relativeTimeSeconds : Int,
    val problem : Problem,
    val author : Party,
    val programmingLanguage : String,
    val verdict : Verdict?,
    val testset : Testset?,
    val passedTestCount : Int,
    val timeConsumedMillis : Int,
    val memoryConsumedBytes : Int,
    val points : Double?,
){
    enum class Verdict {
        FAILED,
        OK,
        PARTIAL,
        COMPILATION_ERROR,
        RUNTIME_ERROR,
        WRONG_ANSWER,
        PRESENTATION_ERROR,
        TIME_LIMIT_EXCEEDED,
        MEMORY_LIMIT_EXCEEDED,
        IDLENESS_LIMIT_EXCEEDED,
        SECURITY_VIOLATED,
        CRASHED,
        INPUT_PREPARATION_CRASHED,
        CHALLENGED,
        SKIPPED,
        TESTING,
        REJECTED
    }

    enum class Testset {
        SAMPLES,
        PRETESTS,
        TESTS,
        CHALLENGES,
        TESTS1,
        TESTS2,
        TESTS3,
        TESTS4,
        TESTS5,
        TESTS6,
        TESTS7,
        TESTS8,
        TESTS9,
        TESTS10,
    }
}
