package com.example.stani.lesson8.factories

import com.example.data.repositories.PersonRepositoryImpl
import com.example.data.repositories.StudentRepositoryImpl
import com.example.domain.usecases.GetPersonUseCase
import com.example.domain.usecases.GetStudentsUseCase
import com.example.domain.usecases.SearchStudentsUseCase

object UseCaseProvide {
    fun provideGetStudentUseCase(): GetStudentsUseCase {
        //используем репозиторий из data слоя (он имплементирует интерфейс, который находится в domain слоя)
        val repository = StudentRepositoryImpl()
        //создаем useCase, в который передаем репозиторий из data слоя (но domain не знает, что он из data, из-за интерфейса в domain)
        val useCase = GetStudentsUseCase(repository)
        return useCase
    }

    fun provideSearchStudentUseCase(): SearchStudentsUseCase {
        return SearchStudentsUseCase(StudentRepositoryImpl())
    }

    fun provideGetRandomPersonUseCase(): GetPersonUseCase {
        val repository = PersonRepositoryImpl()
        val useCase = GetPersonUseCase(repository)
        return useCase
    }
}