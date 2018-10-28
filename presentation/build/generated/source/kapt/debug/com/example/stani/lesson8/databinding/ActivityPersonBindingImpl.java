package com.example.stani.lesson8.databinding;
import com.example.stani.lesson8.R;
import com.example.stani.lesson8.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPersonBindingImpl extends ActivityPersonBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPersonBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityPersonBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.stani.lesson8.presentation.screen.hw10.PersonViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.stani.lesson8.presentation.screen.hw10.PersonViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSurname((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelIsMan((android.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelImageUrl((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSurname(android.databinding.ObservableField<java.lang.String> ViewModelSurname, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelName(android.databinding.ObservableField<java.lang.String> ViewModelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsMan(android.databinding.ObservableField<java.lang.Boolean> ViewModelIsMan, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelImageUrl(android.databinding.ObservableField<java.lang.String> ViewModelImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.databinding.ObservableField<java.lang.String> viewModelSurname = null;
        java.lang.Boolean viewModelIsManGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelName = null;
        android.databinding.ObservableField<java.lang.Boolean> viewModelIsMan = null;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelIsManGet = false;
        java.lang.String viewModelNameGet = null;
        java.lang.String viewModelImageUrlGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelImageUrl = null;
        java.lang.String viewModelSurnameGet = null;
        com.example.stani.lesson8.presentation.screen.hw10.PersonViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.surname
                        viewModelSurname = viewModel.getSurname();
                    }
                    updateRegistration(0, viewModelSurname);


                    if (viewModelSurname != null) {
                        // read viewModel.surname.get()
                        viewModelSurnameGet = viewModelSurname.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.name
                        viewModelName = viewModel.getName();
                    }
                    updateRegistration(1, viewModelName);


                    if (viewModelName != null) {
                        // read viewModel.name.get()
                        viewModelNameGet = viewModelName.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isMan
                        viewModelIsMan = viewModel.isMan();
                    }
                    updateRegistration(2, viewModelIsMan);


                    if (viewModelIsMan != null) {
                        // read viewModel.isMan.get()
                        viewModelIsManGet = viewModelIsMan.get();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.isMan.get())
                    androidDatabindingViewDataBindingSafeUnboxViewModelIsManGet = android.databinding.ViewDataBinding.safeUnbox(viewModelIsManGet);
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageUrl
                        viewModelImageUrl = viewModel.getImageUrl();
                    }
                    updateRegistration(3, viewModelImageUrl);


                    if (viewModelImageUrl != null) {
                        // read viewModel.imageUrl.get()
                        viewModelImageUrlGet = viewModelImageUrl.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            com.example.stani.lesson8.presentation.utils.DataBindingAdaptersKt.loadImage(this.mboundView1, viewModelImageUrlGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            com.example.stani.lesson8.presentation.utils.DataBindingAdaptersKt.background(this.mboundView2, androidDatabindingViewDataBindingSafeUnboxViewModelIsManGet);
            com.example.stani.lesson8.presentation.utils.DataBindingAdaptersKt.background(this.mboundView3, androidDatabindingViewDataBindingSafeUnboxViewModelIsManGet);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelNameGet);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelSurnameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.example.stani.lesson8.presentation.screen.hw10.PersonViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.surname
        flag 1 (0x2L): viewModel.name
        flag 2 (0x3L): viewModel.isMan
        flag 3 (0x4L): viewModel.imageUrl
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}