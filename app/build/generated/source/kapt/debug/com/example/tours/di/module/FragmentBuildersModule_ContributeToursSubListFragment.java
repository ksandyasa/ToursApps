package com.example.tours.di.module;

import com.example.tours.features.fragments.ToursSubListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeToursSubListFragment.ToursSubListFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeToursSubListFragment {
  private FragmentBuildersModule_ContributeToursSubListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ToursSubListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ToursSubListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ToursSubListFragmentSubcomponent extends AndroidInjector<ToursSubListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ToursSubListFragment> {}
  }
}
