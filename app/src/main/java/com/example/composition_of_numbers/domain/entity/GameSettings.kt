package com.example.composition_of_numbers.domain.entity

import java.io.Serializable

data class GameSettings (
    val maxSumValue:Int,
    val minCountOfRightAnswer: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeSeconds: Int
        ) :Serializable