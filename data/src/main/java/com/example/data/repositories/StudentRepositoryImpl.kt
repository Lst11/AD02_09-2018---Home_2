package com.example.data.repositories

import com.example.domain.entity.Student
import com.example.domain.entity.StudentSearch
import com.example.domain.repositories.StudentRepository
import io.reactivex.Completable
import io.reactivex.Observable

class StudentRepositoryImpl : StudentRepository {
    override fun get(): Observable<List<Student>> {
        val list = listOf(Student("0", "Sergey", 25),
                Student("1", "Mihail", 35),
                Student("2", "Kate", 21),
                Student("3", "Vasy", 27),
                Student("4", "Andrey", 15),
                Student("5", "Ivan", 20))
        return Observable.just(list)
    }

    override fun search(search: StudentSearch): Observable<List<Student>> {
        val list = listOf<Student>(Student("0", "Sergey", 25),
                Student("1", "Mihail", 35))
        return Observable.just(list)
    }


    override fun update(student: Student): Completable {
        return Completable.complete()
    }

    override fun delete(studentId: String): Completable {
        return Completable.complete()
    }
}