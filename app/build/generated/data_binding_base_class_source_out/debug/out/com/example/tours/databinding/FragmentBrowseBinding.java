// Generated by data binding compiler. Do not edit!
package com.example.tours.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tours.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBrowseBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView browseList;

  @NonNull
  public final EditText edSearch;

  @NonNull
  public final MaterialToolbar toolbarBrowse;

  protected FragmentBrowseBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView browseList, EditText edSearch, MaterialToolbar toolbarBrowse) {
    super(_bindingComponent, _root, _localFieldCount);
    this.browseList = browseList;
    this.edSearch = edSearch;
    this.toolbarBrowse = toolbarBrowse;
  }

  @NonNull
  public static FragmentBrowseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_browse, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBrowseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBrowseBinding>inflateInternal(inflater, R.layout.fragment_browse, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBrowseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_browse, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBrowseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBrowseBinding>inflateInternal(inflater, R.layout.fragment_browse, null, false, component);
  }

  public static FragmentBrowseBinding bind(@NonNull View view) {
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
  public static FragmentBrowseBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBrowseBinding)bind(component, view, R.layout.fragment_browse);
  }
}
