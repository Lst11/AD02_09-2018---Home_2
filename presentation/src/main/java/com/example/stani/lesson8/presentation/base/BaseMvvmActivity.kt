package com.example.stani.lesson8.presentation.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import com.example.stani.lesson8.BR

abstract class BaseMvvmActivity<VM : BaseViewModel, B : ViewDataBinding> : BaseActivity() {

    protected lateinit var viewModel: VM

    protected lateinit var binding: B


    abstract fun provideViewModel(): VM

    abstract fun provideLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = provideViewModel()
        binding = DataBindingUtil.setContentView(this, provideLayoutId())
        binding.setVariable(BR.viewModel, viewModel)

    }
}