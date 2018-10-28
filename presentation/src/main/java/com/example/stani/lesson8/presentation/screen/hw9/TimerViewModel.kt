package com.example.stani.lesson8.presentation.screen.hw9

import android.databinding.ObservableField
import com.example.stani.lesson8.presentation.base.BaseViewModel
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class TimerViewModel : BaseViewModel<TimerRouter>() {


    val timerTextSeconds = ObservableField<String>("")
    val timerTextMinutes = ObservableField<String>("0")
    val timerTextHours = ObservableField<String>("0")

    private var disposable: Disposable? = null
    private var seconds = 0
    private var minutes = 0
    private var hours = 0

    init {
        var disposable = Observable
                .interval(1, TimeUnit.SECONDS).timeInterval()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    changeData()
                }
    }

    private fun changeData() {
        if (seconds < 60) {
            setTime(seconds++, timerTextSeconds)
        } else {
            seconds = 0
            setTime(seconds++, timerTextSeconds)
            if (minutes < 60) {
                setTime(minutes++, timerTextMinutes)
            } else {
                minutes = 0
                setTime(minutes++, timerTextMinutes)
                setTime(hours++, timerTextHours)
            }


        }
    }

    private fun setTime(value: Int, field: ObservableField<String>) {
        if (value % 2 == 0) field.set(value.toString())
        else value
    }

    override fun onCleared() {
        super.onCleared()
        disposable?.dispose()
    }
}
