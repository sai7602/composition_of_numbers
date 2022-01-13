package com.example.composition_of_numbers.domain.usecases

import com.example.composition_of_numbers.domain.entity.GameSettings
import com.example.composition_of_numbers.domain.entity.Question
import com.example.composition_of_numbers.domain.repository.GameRepository

class GenerateQuestionsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}