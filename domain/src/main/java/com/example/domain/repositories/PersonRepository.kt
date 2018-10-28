package com.example.domain.repositories

import com.example.domain.entity.Person
import com.example.domain.entity.PersonSearch
import io.reactivex.Completable
import io.reactivex.Observable

interface PersonRepository : BaseRepository {
    fun get(): Observable<List<Person>>
    fun search(search: PersonSearch): Observable<List<Person>>
    fun update(person: Person): Completable
    fun delete(personName: String): Completable
    fun getRandomEntity(): Person
}