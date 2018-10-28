package com.example.stani.lesson8.presentation.base

import android.support.v4.app.FragmentActivity
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseActivity : FragmentActivity() {

    protected val compositeDisposable: CompositeDisposable by lazy {
        CompositeDisposable()
    }

    protected fun addToDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    fun onCleared() {
        compositeDisposable.clear()
    }
}