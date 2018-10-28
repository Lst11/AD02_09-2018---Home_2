package com.example.stani.lesson8.presentation.base

import android.databinding.ViewDataBinding
import android.os.Bundle

abstract class BaseMvvmFragment<VM : BaseViewModel<R>,
        R : BaseRouter<*>,
        B : ViewDataBinding> : BaseFragment() {

    protected lateinit var viewModel: VM
    protected lateinit var binding: B
    protected var router: R? = null

    abstract fun provideViewModel(): VM
    abstract fun provideRouter(): R
    abstract fun provideLayoutId(): Int

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity is BaseMvvmActivity<*, *, *>) {
            router = (activity as BaseMvvmActivity<*, *, *>).router as R
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.addRouter(router)
    }

    override fun onPause() {
        super.onPause()
        viewModel.removeRouter()

    }
}