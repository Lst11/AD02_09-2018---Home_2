package com.example.stani.lesson8.databinding;
import com.example.stani.lesson8.R;
import com.example.stani.lesson8.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityStudentListBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewDot1, 4);
        sViewsWithIds.put(R.id.Dot2, 5);
    }
    // views
    @NonNull
    public final android.widget.TextView Dot2;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.widget.TextView textViewDot1;
    @NonNull
    public final android.widget.TextView textViewHour;
    @NonNull
    public final android.widget.TextView textViewMinutes;
    @NonNull
    public final android.widget.TextView textViewSeconds;
    // variables
    @Nullable
    private com.example.stani.lesson8.presentation.screen.hw9.TimerViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityStudentListBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.Dot2 = (android.widget.TextView) bindings[5];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewDot1 = (android.widget.TextView) bindings[4];
        this.textViewHour = (android.widget.TextView) bindings[1];
        this.textViewHour.setTag(null);
        this.textViewMinutes = (android.widget.TextView) bindings[2];
        this.textViewMinutes.setTag(null);
        this.textViewSeconds = (android.widget.TextView) bindings[3];
        this.textViewSeconds.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.example.stani.lesson8.presentation.screen.hw9.TimerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.stani.lesson8.presentation.screen.hw9.TimerViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.example.stani.lesson8.presentation.screen.hw9.TimerViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTimerTextHours((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelTimerTextMinutes((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelTimerTextSeconds((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTimerTextHours(android.databinding.ObservableField<java.lang.String> ViewModelTimerTextHours, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTimerTextMinutes(android.databinding.ObservableField<java.lang.String> ViewModelTimerTextMinutes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTimerTextSeconds(android.databinding.ObservableField<java.lang.String> ViewModelTimerTextSeconds, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewModelTimerTextMinutesGet = null;
        java.lang.String viewModelTimerTextHoursGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelTimerTextHours = null;
        java.lang.String viewModelTimerTextSecondsGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelTimerTextMinutes = null;
        android.databinding.ObservableField<java.lang.String> viewModelTimerTextSeconds = null;
        com.example.stani.lesson8.presentation.screen.hw9.TimerViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.timerTextHours
                        viewModelTimerTextHours = viewModel.getTimerTextHours();
                    }
                    updateRegistration(0, viewModelTimerTextHours);


                    if (viewModelTimerTextHours != null) {
                        // read viewModel.timerTextHours.get()
                        viewModelTimerTextHoursGet = viewModelTimerTextHours.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.timerTextMinutes
                        viewModelTimerTextMinutes = viewModel.getTimerTextMinutes();
                    }
                    updateRegistration(1, viewModelTimerTextMinutes);


                    if (viewModelTimerTextMinutes != null) {
                        // read viewModel.timerTextMinutes.get()
                        viewModelTimerTextMinutesGet = viewModelTimerTextMinutes.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.timerTextSeconds
                        viewModelTimerTextSeconds = viewModel.getTimerTextSeconds();
                    }
                    updateRegistration(2, viewModelTimerTextSeconds);


                    if (viewModelTimerTextSeconds != null) {
                        // read viewModel.timerTextSeconds.get()
                        viewModelTimerTextSecondsGet = viewModelTimerTextSeconds.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textViewHour, viewModelTimerTextHoursGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textViewMinutes, viewModelTimerTextMinutesGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textViewSeconds, viewModelTimerTextSecondsGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityStudentListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityStudentListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityStudentListBinding>inflate(inflater, com.example.stani.lesson8.R.layout.activity_student_list, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityStudentListBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityStudentListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.stani.lesson8.R.layout.activity_student_list, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityStudentListBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityStudentListBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_student_list_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityStudentListBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.timerTextHours
        flag 1 (0x2L): viewModel.timerTextMinutes
        flag 2 (0x3L): viewModel.timerTextSeconds
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}