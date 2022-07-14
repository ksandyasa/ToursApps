package com.example.tours.di.module;

import com.example.tours.features.fragments.ToursDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeToursDetailFragment.ToursDetailFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeToursDetailFragment {
  private FragmentBuildersModule_ContributeToursDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ToursDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ToursDetailFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ToursDetailFragmentSubcomponent extends AndroidInjector<ToursDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ToursDetailFragment> {}
  }
}
