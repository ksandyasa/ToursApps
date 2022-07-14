package com.example.tours.di.module;

import com.example.tours.features.fragments.ToursListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeToursListFragment {
  private FragmentBuildersModule_ContributeToursListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ToursListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ToursListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ToursListFragmentSubcomponent extends AndroidInjector<ToursListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ToursListFragment> {}
  }
}
