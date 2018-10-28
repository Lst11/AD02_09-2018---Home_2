package com.example.stani.lesson8.presentation.screen.hw9;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\u001e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/example/stani/lesson8/presentation/screen/hw9/TimerViewModel;", "Lcom/example/stani/lesson8/presentation/base/BaseViewModel;", "Lcom/example/stani/lesson8/presentation/screen/hw9/TimerRouter;", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "hours", "", "minutes", "seconds", "timerTextHours", "Landroid/databinding/ObservableField;", "", "getTimerTextHours", "()Landroid/databinding/ObservableField;", "timerTextMinutes", "getTimerTextMinutes", "timerTextSeconds", "getTimerTextSeconds", "changeData", "", "onCleared", "setTime", "value", "field", "presentation_debug"})
public final class TimerViewModel extends com.example.stani.lesson8.presentation.base.BaseViewModel<com.example.stani.lesson8.presentation.screen.hw9.TimerRouter> {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> timerTextSeconds = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> timerTextMinutes = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> timerTextHours = null;
    private io.reactivex.disposables.Disposable disposable;
    private int seconds;
    private int minutes;
    private int hours;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getTimerTextSeconds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getTimerTextMinutes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getTimerTextHours() {
        return null;
    }
    
    private final void changeData() {
    }
    
    private final void setTime(int value, android.databinding.ObservableField<java.lang.String> field) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public TimerViewModel() {
        super();
    }
}