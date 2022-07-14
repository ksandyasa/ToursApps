package com.example.tours.di.module;

import com.example.tours.features.activities.main.SubMainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents = SubMainActivityModule_ContributeSubMainActivity.SubMainActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class SubMainActivityModule_ContributeSubMainActivity {
  private SubMainActivityModule_ContributeSubMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SubMainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SubMainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = FragmentBuildersModule.class)
  public interface SubMainActivitySubcomponent extends AndroidInjector<SubMainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SubMainActivity> {}
  }
}
