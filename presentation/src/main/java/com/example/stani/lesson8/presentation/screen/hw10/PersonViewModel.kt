package com.example.stani.lesson8.presentation.screen.hw10

import android.databinding.ObservableField
import android.util.Log
import com.example.domain.entity.Person
import com.example.stani.lesson8.factories.UseCaseProvide
import com.example.stani.lesson8.presentation.base.BaseViewModel
import io.reactivex.disposables.Disposable

class PersonViewModel : BaseViewModel<PersonRouter>() {

    private val getPersonUseCase = UseCaseProvide.provideGetRandomPersonUseCase()

    val imageUrl = ObservableField<String>("")
    val name = ObservableField<String>("")
    val surname = ObservableField<String>("")
    val isMan = ObservableField<Boolean>(false)


    private var disposable: Disposable? = null

    init {
        Log.e("AAA", "init()")
        setData()
    }

    fun onClick() {
        setData()
    }

    private fun setData() {
        val person: Person = getPersonUseCase.getRandomPerson()
        imageUrl.set(person.url)
        name.set(person.name)
        surname.set(person.surname)
        isMan.set(person.isMan)
    }
}