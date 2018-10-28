package com.example.stani.lesson8.presentation.screen.student

import android.databinding.ObservableField
import android.util.Log
import com.example.stani.lesson8.factories.UseCaseProvide
import com.example.stani.lesson8.presentation.base.BaseViewModel
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.subscribeBy

class StudentViewModel() : BaseViewModel<StudentRouter>() {

    val urlStr = ObservableField<String>("")


    private val getStudentsUseCase = UseCaseProvide.provideGetStudentUseCase()
    private val searchStudentsUseCase = UseCaseProvide.provideSearchStudentUseCase()
//    private val subject: ReplaySubject<String> = ReplaySubject.create() // ot createDefault("0")//PublishSubject(хранит только после) -> BehaviorSubject(хранит после подписки + изначальное состояние) -> ReplaySubject (все и можно задать кол-во)

    val studentSize = ObservableField<String>("No data")  // observable дает возможность менять поле в xml при изменении поля

    private var disposable: Disposable? = null

    init {
        Log.e("AAA", "init()")
        val listStudents = getStudentsUseCase.get()
//        studentSize.set("studentList.Size() = ${listStudents.size}")

        val disposable = getStudentsUseCase.get()
                .subscribeBy(
                        onNext = {
                            //                            url.set(it[0].url()) - для дз
                            studentSize.set("studentList.Size() = ${it.size}")
                        },
                        onError = {
                            studentSize.set("onError() " + it.toString())
                        })
        addToDisposable(disposable)

//        subject.onNext("Item 1")
//        subject.onNext("Item 2")
//        disposable = subject
//                .subscribeBy {
//                    Log.e("AAA", "publishSubject" + it)
//                }
//        subject.onNext("Item 3")
//        subject.onNext("Item 4")
//        subject.onNext("Item 5")


//        Observable.just("125", "200", "500")
//                .map { Integer.valueOf(it) }// transform from string to Int
////                .delay(2,TimeUnit.SECONDS)
//                .doOnNext {}//промежуточное действие
//                .filter { it > 200 }//return boolean
//                .subscribeBy(
//                        onError = {
//                            Log.e("aaa", "onError")
//                        },
//                        onComplete = {
//                            Log.e("aaa", "onComplete")
//                        },
//                        onNext = {
//                            Log.e("aaa", "onNext" + it)
//
//                        })
        //или то, что ниже, если не сокращать
//                .observeOn(AndroidSchedulers.mainThread())// где получить ответ
//                .subscribeOn(Schedulers.io())// указываем поток, в котором действие выполняется
//                .subscribe(object : Observer<Int> {
//                    override fun onComplete() {
//                        Log.e("aaa", "onComplete")
//                    }
//
//                    override fun onSubscribe(d: Disposable) {
//                        Log.e("aaa", "onSubscribe")
//                        disposable = d
//                    }
//
//                    override fun onNext(t: Int) {
//                        Log.e("aaa", "onNext" + t)
//                    }
//
//                    override fun onError(e: Throwable) {
//                        Log.e("aaa", "onError")
//                    }
//
//                })
    }


    //при удалении вью
    // нельзя давать во view model ссылку на activity!


//    override fun onCleared() {
//        super.onCleared()
//        disposable?.dispose()
//    }
}