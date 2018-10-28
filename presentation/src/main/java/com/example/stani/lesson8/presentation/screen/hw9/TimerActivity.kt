package com.example.stani.lesson8.presentation.screen.hw9

import android.arch.lifecycle.ViewModelProviders
import com.example.stani.lesson8.R
import com.example.stani.lesson8.databinding.ActivityStudentListBinding
import com.example.stani.lesson8.presentation.base.BaseMvvmActivity


class TimerActivity : BaseMvvmActivity<TimerViewModel, TimerRouter, ActivityStudentListBinding>() {

    override fun provideViewModel(): TimerViewModel {
        return ViewModelProviders.of(this).get(TimerViewModel::class.java)
    }

    override fun provideLayoutId(): Int = R.layout.activity_student_list

    override fun provideRouter(): TimerRouter {
        return TimerRouter(this)
    }
}