package com.example.composition_of_numbers.domain.usecases

import com.example.composition_of_numbers.domain.entity.GameSettings
import com.example.composition_of_numbers.domain.entity.Level
import com.example.composition_of_numbers.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}