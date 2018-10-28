package com.example.stani.lesson8.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ActivityPersonBinding extends ViewDataBinding {
    // variables
    protected com.example.stani.lesson8.presentation.screen.hw10.PersonViewModel mViewModel;
    protected ActivityPersonBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
    ) {
        super(bindingComponent, root_, localFieldCount);
    }
    //getters and abstract setters
    public abstract void setViewModel(@Nullable com.example.stani.lesson8.presentation.screen.hw10.PersonViewModel ViewModel);
    @Nullable
    public com.example.stani.lesson8.presentation.screen.hw10.PersonViewModel getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static ActivityPersonBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityPersonBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityPersonBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityPersonBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityPersonBinding>inflate(inflater, com.example.stani.lesson8.R.layout.activity_person, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityPersonBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityPersonBinding>inflate(inflater, com.example.stani.lesson8.R.layout.activity_person, null, false, bindingComponent);
    }
    @NonNull
    public static ActivityPersonBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityPersonBinding)bind(bindingComponent, view, com.example.stani.lesson8.R.layout.activity_person);
    }
}