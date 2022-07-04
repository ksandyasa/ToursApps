package com.example.tours.di.module;

import com.example.tours.features.activities.main.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(subcomponents = MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainActivityModule_ContributeMainActivity {
  private MainActivityModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = FragmentBuildersModule.class)
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
