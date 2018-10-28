package com.example.stani.lesson8.presentation.screen.hw10

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.example.stani.lesson8.R
import com.example.stani.lesson8.databinding.ActivityPersonBinding
import com.example.stani.lesson8.presentation.base.BaseMvvmActivity

class PersonActivity : BaseMvvmActivity<PersonViewModel, PersonRouter, ActivityPersonBinding>() {

    override fun provideViewModel(): PersonViewModel {
        return ViewModelProviders.of(this).get(PersonViewModel::class.java)
    }

    override fun provideLayoutId(): Int = R.layout.activity_person

    override fun provideRouter(): PersonRouter {
        return PersonRouter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}