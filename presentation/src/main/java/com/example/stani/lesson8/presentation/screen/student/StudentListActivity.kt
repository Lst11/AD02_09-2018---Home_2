package com.example.stani.lesson8.presentation.screen.student

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.example.stani.lesson8.R
import com.example.stani.lesson8.databinding.ActivityStudentListBinding
import com.example.stani.lesson8.presentation.base.BaseMvvmActivity

class StudentListActivity : BaseMvvmActivity<StudentViewModel, StudentRouter, ActivityStudentListBinding>() {

    override fun provideViewModel(): StudentViewModel {
        return ViewModelProviders.of(this).get(StudentViewModel::class.java)
    }

    override fun provideLayoutId(): Int = R.layout.activity_student_list

    override fun provideRouter(): StudentRouter {
        return StudentRouter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* можно подписаться на изменения viewModel, если нужны данные из view нужны в активити
//        viewModel.testText.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback(){
//            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
//
//            }
//        })*/
    }
}