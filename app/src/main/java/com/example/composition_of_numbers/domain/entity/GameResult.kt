package com.example.composition_of_numbers.domain.entity

import java.io.Serializable

data class GameResult (
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
        ) : Serializable