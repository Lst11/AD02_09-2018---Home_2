package com.example.domain.usecases

import android.view.SearchEvent
import com.example.domain.entity.Student
import com.example.domain.repositories.StudentRepository
import io.reactivex.Observable

class GetStudentsUseCase(val studentRepository: StudentRepository) : BaseUseCase() {
    fun get(): Observable<List<Student>> {
        return studentRepository.get()
    }
}