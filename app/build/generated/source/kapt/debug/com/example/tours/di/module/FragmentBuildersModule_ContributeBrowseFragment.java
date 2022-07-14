package com.example.tours.di.module;

import com.example.tours.features.fragments.BrowseFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents = FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeBrowseFragment {
  private FragmentBuildersModule_ContributeBrowseFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BrowseFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BrowseFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface BrowseFragmentSubcomponent extends AndroidInjector<BrowseFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BrowseFragment> {}
  }
}
