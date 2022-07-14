// Generated by data binding compiler. Do not edit!
package com.example.tours.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tours.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentToursListBinding extends ViewDataBinding {
  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final RecyclerView toursList;

  protected FragmentToursListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialToolbar toolbar, RecyclerView toursList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbar = toolbar;
    this.toursList = toursList;
  }

  @NonNull
  public static FragmentToursListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_tours_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentToursListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentToursListBinding>inflateInternal(inflater, R.layout.fragment_tours_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentToursListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_tours_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentToursListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentToursListBinding>inflateInternal(inflater, R.layout.fragment_tours_list, null, false, component);
  }

  public static FragmentToursListBinding bind(@NonNull View view) {
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
  public static FragmentToursListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentToursListBinding)bind(component, view, R.layout.fragment_tours_list);
  }
}
