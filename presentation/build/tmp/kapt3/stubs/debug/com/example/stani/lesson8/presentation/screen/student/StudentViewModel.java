package com.example.stani.lesson8.presentation.screen.student;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/example/stani/lesson8/presentation/screen/student/StudentViewModel;", "Lcom/example/stani/lesson8/presentation/base/BaseViewModel;", "Lcom/example/stani/lesson8/presentation/screen/student/StudentRouter;", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "getStudentsUseCase", "Lcom/example/domain/usecases/GetStudentsUseCase;", "searchStudentsUseCase", "Lcom/example/domain/usecases/SearchStudentsUseCase;", "studentSize", "Landroid/databinding/ObservableField;", "", "getStudentSize", "()Landroid/databinding/ObservableField;", "urlStr", "getUrlStr", "presentation_debug"})
public final class StudentViewModel extends com.example.stani.lesson8.presentation.base.BaseViewModel<com.example.stani.lesson8.presentation.screen.student.StudentRouter> {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> urlStr = null;
    private final com.example.domain.usecases.GetStudentsUseCase getStudentsUseCase = null;
    private final com.example.domain.usecases.SearchStudentsUseCase searchStudentsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> studentSize = null;
    private io.reactivex.disposables.Disposable disposable;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getUrlStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getStudentSize() {
        return null;
    }
    
    public StudentViewModel() {
        super();
    }
}