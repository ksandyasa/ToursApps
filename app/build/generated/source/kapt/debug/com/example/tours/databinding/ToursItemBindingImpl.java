package com.example.tours.databinding;
import com.example.tours.R;
import com.example.tours.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ToursItemBindingImpl extends ToursItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.compasView, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ToursItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ToursItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.countTours.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.placeName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.tour == variableId) {
            setTour((com.example.tours.model.Tour) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTour(@Nullable com.example.tours.model.Tour Tour) {
        this.mTour = Tour;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tour);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String tourSubPlace = null;
        com.example.tours.model.Tour tour = mTour;
        java.lang.String tourImages = null;
        java.lang.String tourTitle = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tour != null) {
                    // read tour.sub_place
                    tourSubPlace = tour.getSub_place();
                    // read tour.images
                    tourImages = tour.getImages();
                    // read tour.title
                    tourTitle = tour.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.tours.features.adapters.BindingAdapterKt.setCountText(this.countTours, tourSubPlace);
            com.example.tours.features.adapters.BindingAdapterKt.loadImage(this.imageView, tourImages);
            com.example.tours.features.adapters.BindingAdapterKt.setTitleText(this.placeName, tourTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tour
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}