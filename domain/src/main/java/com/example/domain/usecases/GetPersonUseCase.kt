package com.example.domain.usecases

import com.example.domain.entity.Person
import com.example.domain.repositories.PersonRepository

class GetPersonUseCase(val peopleRepository: PersonRepository) : BaseUseCase() {
    fun getRandomPerson(): Person {
        return peopleRepository.getRandomEntity()
    }
}