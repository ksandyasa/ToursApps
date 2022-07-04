package com.example.tours.di.module;

import com.example.tours.features.fragments.BrowseDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeBrowseDetailFragment.BrowseDetailFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeBrowseDetailFragment {
  private FragmentBuildersModule_ContributeBrowseDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BrowseDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BrowseDetailFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface BrowseDetailFragmentSubcomponent extends AndroidInjector<BrowseDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BrowseDetailFragment> {}
  }
}
