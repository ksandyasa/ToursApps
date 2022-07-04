// Generated by data binding compiler. Do not edit!
package com.example.tours.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.tours.R;
import com.example.tours.model.Tour;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ToursItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView compasView;

  @NonNull
  public final TextView countTours;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView placeName;

  @Bindable
  protected Tour mTour;

  protected ToursItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView compasView, TextView countTours, ImageView imageView, TextView placeName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.compasView = compasView;
    this.countTours = countTours;
    this.imageView = imageView;
    this.placeName = placeName;
  }

  public abstract void setTour(@Nullable Tour tour);

  @Nullable
  public Tour getTour() {
    return mTour;
  }

  @NonNull
  public static ToursItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tours_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ToursItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ToursItemBinding>inflateInternal(inflater, R.layout.tours_item, root, attachToRoot, component);
  }

  @NonNull
  public static ToursItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tours_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ToursItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ToursItemBinding>inflateInternal(inflater, R.layout.tours_item, null, false, component);
  }

  public static ToursItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ToursItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ToursItemBinding)bind(component, view, R.layout.tours_item);
  }
}
