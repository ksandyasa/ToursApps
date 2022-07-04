package com.example.tours;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.tours.databinding.FragmentBrowseBindingImpl;
import com.example.tours.databinding.FragmentBrowseDetailBindingImpl;
import com.example.tours.databinding.FragmentProfileBindingImpl;
import com.example.tours.databinding.FragmentToursDetailBindingImpl;
import com.example.tours.databinding.FragmentToursListBindingImpl;
import com.example.tours.databinding.FragmentToursSubListBindingImpl;
import com.example.tours.databinding.TabsItemBindingImpl;
import com.example.tours.databinding.ToursItemBindingImpl;
import com.example.tours.databinding.ToursSubItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTBROWSE = 1;

  private static final int LAYOUT_FRAGMENTBROWSEDETAIL = 2;

  private static final int LAYOUT_FRAGMENTPROFILE = 3;

  private static final int LAYOUT_FRAGMENTTOURSDETAIL = 4;

  private static final int LAYOUT_FRAGMENTTOURSLIST = 5;

  private static final int LAYOUT_FRAGMENTTOURSSUBLIST = 6;

  private static final int LAYOUT_TABSITEM = 7;

  private static final int LAYOUT_TOURSITEM = 8;

  private static final int LAYOUT_TOURSSUBITEM = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tours.R.layout.fragment_browse, LAYOUT_FRAGMENTBROWSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tours.R.layout.fragment_browse_detail, LAYOUT_FRAGMENTBROWSEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tours.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tours.R.layout.fragment_tours_detail, LAYOUT_FRAGMENTTOURSDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tours.R.layout.fragment_tours_list, LAYOUT_FRAGMENTTOURSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tours.R.layout.fragment_tours_sub_list, LAYOUT_FRAGMENTTOURSSUBLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tours.R.layout.tabs_item, LAYOUT_TABSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tours.R.layout.tours_item, LAYOUT_TOURSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tours.R.layout.tours_sub_item, LAYOUT_TOURSSUBITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTBROWSE: {
          if ("layout/fragment_browse_0".equals(tag)) {
            return new FragmentBrowseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_browse is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBROWSEDETAIL: {
          if ("layout/fragment_browse_detail_0".equals(tag)) {
            return new FragmentBrowseDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_browse_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTOURSDETAIL: {
          if ("layout/fragment_tours_detail_0".equals(tag)) {
            return new FragmentToursDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tours_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTOURSLIST: {
          if ("layout/fragment_tours_list_0".equals(tag)) {
            return new FragmentToursListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tours_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTOURSSUBLIST: {
          if ("layout/fragment_tours_sub_list_0".equals(tag)) {
            return new FragmentToursSubListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tours_sub_list is invalid. Received: " + tag);
        }
        case  LAYOUT_TABSITEM: {
          if ("layout/tabs_item_0".equals(tag)) {
            return new TabsItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tabs_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TOURSITEM: {
          if ("layout/tours_item_0".equals(tag)) {
            return new ToursItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tours_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TOURSSUBITEM: {
          if ("layout/tours_sub_item_0".equals(tag)) {
            return new ToursSubItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tours_sub_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "tour");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/fragment_browse_0", com.example.tours.R.layout.fragment_browse);
      sKeys.put("layout/fragment_browse_detail_0", com.example.tours.R.layout.fragment_browse_detail);
      sKeys.put("layout/fragment_profile_0", com.example.tours.R.layout.fragment_profile);
      sKeys.put("layout/fragment_tours_detail_0", com.example.tours.R.layout.fragment_tours_detail);
      sKeys.put("layout/fragment_tours_list_0", com.example.tours.R.layout.fragment_tours_list);
      sKeys.put("layout/fragment_tours_sub_list_0", com.example.tours.R.layout.fragment_tours_sub_list);
      sKeys.put("layout/tabs_item_0", com.example.tours.R.layout.tabs_item);
      sKeys.put("layout/tours_item_0", com.example.tours.R.layout.tours_item);
      sKeys.put("layout/tours_sub_item_0", com.example.tours.R.layout.tours_sub_item);
    }
  }
}
