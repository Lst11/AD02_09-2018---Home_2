package com.example.stani.lesson8.presentation.screen.login

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.example.stani.lesson8.R
import com.example.stani.lesson8.databinding.ActivityLoginBinding
import com.example.stani.lesson8.presentation.base.BaseMvvmActivity

class LoginActivity : BaseMvvmActivity<LoginViewModel, ActivityLoginBinding>() {

    override fun provideViewModel(): LoginViewModel {
        return ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }

    override fun provideLayoutId(): Int = R.layout.activity_login


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}