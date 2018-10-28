
package android.databinding;
import com.example.stani.lesson8.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.example.stani.lesson8.R.layout.activity_student_list:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_student_list_0".equals(tag)) {
                            return new com.example.stani.lesson8.databinding.ActivityStudentListBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_student_list is invalid. Received: " + tag);
                }
                case com.example.stani.lesson8.R.layout.activity_person:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_person_0".equals(tag)) {
                            return new com.example.stani.lesson8.databinding.ActivityPersonBindingImpl(bindingComponent, view);
                    }
                    if ("layout-land/activity_person_0".equals(tag)) {
                            return new com.example.stani.lesson8.databinding.ActivityPersonBindingLandImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_person is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 673288862: {
                if(tag.equals("layout/activity_student_list_0")) {
                    return com.example.stani.lesson8.R.layout.activity_student_list;
                }
                break;
            }
            case -343855791: {
                if(tag.equals("layout/activity_person_0")) {
                    return com.example.stani.lesson8.R.layout.activity_person;
                }
                break;
            }
            case -3736619: {
                if(tag.equals("layout-land/activity_person_0")) {
                    return com.example.stani.lesson8.R.layout.activity_person;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"viewModel"};
    }
}