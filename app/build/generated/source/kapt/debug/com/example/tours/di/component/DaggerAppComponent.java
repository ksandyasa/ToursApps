package com.example.tours.di.component;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import androidx.lifecycle.ViewModel;
import com.example.tours.App;
import com.example.tours.api.RestApi;
import com.example.tours.di.module.FragmentBuildersModule_ContributeBrowseDetailFragment;
import com.example.tours.di.module.FragmentBuildersModule_ContributeBrowseFragment;
import com.example.tours.di.module.FragmentBuildersModule_ContributeProfileFragment;
import com.example.tours.di.module.FragmentBuildersModule_ContributeToursDetailFragment;
import com.example.tours.di.module.FragmentBuildersModule_ContributeToursListFragment;
import com.example.tours.di.module.FragmentBuildersModule_ContributeToursSubListFragment;
import com.example.tours.di.module.MainActivityModule_ContributeMainActivity;
import com.example.tours.di.module.NetworkModule_ProvideMockClient$app_debugFactory;
import com.example.tours.di.module.NetworkModule_ProvideOkHttpClient$app_debugFactory;
import com.example.tours.di.module.NetworkModule_ProvideRestApi$app_debugFactory;
import com.example.tours.di.module.NetworkModule_ProvideRetrofitInterface$app_debugFactory;
import com.example.tours.di.module.SubMainActivityModule_ContributeSubMainActivity;
import com.example.tours.features.activities.main.MainActivity;
import com.example.tours.features.activities.main.SubMainActivity;
import com.example.tours.features.fragments.BrowseDetailFragment;
import com.example.tours.features.fragments.BrowseFragment;
import com.example.tours.features.fragments.BrowseFragment_MembersInjector;
import com.example.tours.features.fragments.ProfileFragment;
import com.example.tours.features.fragments.ToursDetailFragment;
import com.example.tours.features.fragments.ToursListFragment;
import com.example.tours.features.fragments.ToursListFragment_MembersInjector;
import com.example.tours.features.fragments.ToursSubListFragment;
import com.example.tours.features.fragments.ToursSubListFragment_MembersInjector;
import com.example.tours.utils.MockClient;
import com.example.tours.viewmodels.BrowseViewModel;
import com.example.tours.viewmodels.BrowseViewModel_Factory;
import com.example.tours.viewmodels.ToursSubViewModel;
import com.example.tours.viewmodels.ToursSubViewModel_Factory;
import com.example.tours.viewmodels.ToursViewModel;
import com.example.tours.viewmodels.ToursViewModel_Factory;
import com.example.tours.viewmodels.ViewModelFactory;
import com.example.tours.viewmodels.ViewModelFactory_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<
          SubMainActivityModule_ContributeSubMainActivity.SubMainActivitySubcomponent.Builder>
      subMainActivitySubcomponentBuilderProvider;

  private Provider<Application> applicationProvider;

  private Provider<MockClient> provideMockClient$app_debugProvider;

  private Provider<OkHttpClient> provideOkHttpClient$app_debugProvider;

  private Provider<Retrofit> provideRetrofitInterface$app_debugProvider;

  private Provider<RestApi> provideRestApi$app_debugProvider;

  private ToursViewModel_Factory toursViewModelProvider;

  private ToursSubViewModel_Factory toursSubViewModelProvider;

  private BrowseViewModel_Factory browseViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>>
      mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<ViewModelFactory> viewModelFactoryProvider;

  private DaggerAppComponent(Builder builder) {

    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(2)
        .put(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider)
        .put(SubMainActivity.class, (Provider) subMainActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<BroadcastReceiver>
      getDispatchingAndroidInjectorOfBroadcastReceiver() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<Service> getDispatchingAndroidInjectorOfService() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<ContentProvider>
      getDispatchingAndroidInjectorOfContentProvider() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.subMainActivitySubcomponentBuilderProvider =
        new Provider<
            SubMainActivityModule_ContributeSubMainActivity.SubMainActivitySubcomponent.Builder>() {
          @Override
          public SubMainActivityModule_ContributeSubMainActivity.SubMainActivitySubcomponent.Builder
              get() {
            return new SubMainActivitySubcomponentBuilder();
          }
        };
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideMockClient$app_debugProvider =
        SingleCheck.provider(
            NetworkModule_ProvideMockClient$app_debugFactory.create(applicationProvider));
    this.provideOkHttpClient$app_debugProvider =
        SingleCheck.provider(
            NetworkModule_ProvideOkHttpClient$app_debugFactory.create(
                provideMockClient$app_debugProvider));
    this.provideRetrofitInterface$app_debugProvider =
        SingleCheck.provider(
            NetworkModule_ProvideRetrofitInterface$app_debugFactory.create(
                provideOkHttpClient$app_debugProvider));
    this.provideRestApi$app_debugProvider =
        SingleCheck.provider(
            NetworkModule_ProvideRestApi$app_debugFactory.create(
                provideRetrofitInterface$app_debugProvider));
    this.toursViewModelProvider = ToursViewModel_Factory.create(provideRestApi$app_debugProvider);
    this.toursSubViewModelProvider =
        ToursSubViewModel_Factory.create(provideRestApi$app_debugProvider);
    this.browseViewModelProvider = BrowseViewModel_Factory.create(provideRestApi$app_debugProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider =
        MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(3)
            .put(ToursViewModel.class, (Provider) toursViewModelProvider)
            .put(ToursSubViewModel.class, (Provider) toursSubViewModelProvider)
            .put(BrowseViewModel.class, (Provider) browseViewModelProvider)
            .build();
    this.viewModelFactoryProvider =
        DoubleCheck.provider(
            ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
  }

  @Override
  public void inject(App app) {
    injectApp(app);
  }

  private App injectApp(App instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance, getDispatchingAndroidInjectorOfBroadcastReceiver());
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance, getDispatchingAndroidInjectorOfService());
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance, getDispatchingAndroidInjectorOfContentProvider());
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends MainActivityModule_ContributeMainActivity.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public MainActivityModule_ContributeMainActivity.MainActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, MainActivity.class);
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements MainActivityModule_ContributeMainActivity.MainActivitySubcomponent {
    private Provider<
            FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
                .Builder>
        toursListFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeToursSubListFragment.ToursSubListFragmentSubcomponent
                .Builder>
        toursSubListFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent.Builder>
        browseFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent.Builder>
        profileFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeToursDetailFragment.ToursDetailFragmentSubcomponent
                .Builder>
        toursDetailFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeBrowseDetailFragment.BrowseDetailFragmentSubcomponent
                .Builder>
        browseDetailFragmentSubcomponentBuilderProvider;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {

      initialize(builder);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(8)
          .put(
              MainActivity.class,
              (Provider) DaggerAppComponent.this.mainActivitySubcomponentBuilderProvider)
          .put(
              SubMainActivity.class,
              (Provider) DaggerAppComponent.this.subMainActivitySubcomponentBuilderProvider)
          .put(ToursListFragment.class, (Provider) toursListFragmentSubcomponentBuilderProvider)
          .put(
              ToursSubListFragment.class,
              (Provider) toursSubListFragmentSubcomponentBuilderProvider)
          .put(BrowseFragment.class, (Provider) browseFragmentSubcomponentBuilderProvider)
          .put(ProfileFragment.class, (Provider) profileFragmentSubcomponentBuilderProvider)
          .put(ToursDetailFragment.class, (Provider) toursDetailFragmentSubcomponentBuilderProvider)
          .put(
              BrowseDetailFragment.class,
              (Provider) browseDetailFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment2() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {
      this.toursListFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
                    .Builder
                get() {
              return new ToursListFragmentSubcomponentBuilder();
            }
          };
      this.toursSubListFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeToursSubListFragment.ToursSubListFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeToursSubListFragment
                    .ToursSubListFragmentSubcomponent.Builder
                get() {
              return new ToursSubListFragmentSubcomponentBuilder();
            }
          };
      this.browseFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent
                    .Builder
                get() {
              return new BrowseFragmentSubcomponentBuilder();
            }
          };
      this.profileFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
                    .Builder
                get() {
              return new ProfileFragmentSubcomponentBuilder();
            }
          };
      this.toursDetailFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeToursDetailFragment.ToursDetailFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeToursDetailFragment
                    .ToursDetailFragmentSubcomponent.Builder
                get() {
              return new ToursDetailFragmentSubcomponentBuilder();
            }
          };
      this.browseDetailFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeBrowseDetailFragment.BrowseDetailFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeBrowseDetailFragment
                    .BrowseDetailFragmentSubcomponent.Builder
                get() {
              return new BrowseDetailFragmentSubcomponentBuilder();
            }
          };
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment2());
      return instance;
    }

    private final class ToursListFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
            .Builder {
      private ToursListFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
          build() {
        Preconditions.checkBuilderRequirement(seedInstance, ToursListFragment.class);
        return new ToursListFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ToursListFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ToursListFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeToursListFragment
            .ToursListFragmentSubcomponent {
      private ToursListFragmentSubcomponentImpl(ToursListFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ToursListFragment arg0) {
        injectToursListFragment(arg0);
      }

      private ToursListFragment injectToursListFragment(ToursListFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        ToursListFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ToursSubListFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeToursSubListFragment
            .ToursSubListFragmentSubcomponent.Builder {
      private ToursSubListFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeToursSubListFragment.ToursSubListFragmentSubcomponent
          build() {
        Preconditions.checkBuilderRequirement(seedInstance, ToursSubListFragment.class);
        return new ToursSubListFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ToursSubListFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ToursSubListFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeToursSubListFragment
            .ToursSubListFragmentSubcomponent {
      private ToursSubListFragmentSubcomponentImpl(
          ToursSubListFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ToursSubListFragment arg0) {
        injectToursSubListFragment(arg0);
      }

      private ToursSubListFragment injectToursSubListFragment(ToursSubListFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        ToursSubListFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class BrowseFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent.Builder {
      private BrowseFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent build() {
        Preconditions.checkBuilderRequirement(seedInstance, BrowseFragment.class);
        return new BrowseFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(BrowseFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class BrowseFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent {
      private BrowseFragmentSubcomponentImpl(BrowseFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(BrowseFragment arg0) {
        injectBrowseFragment(arg0);
      }

      private BrowseFragment injectBrowseFragment(BrowseFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        BrowseFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ProfileFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
            .Builder {
      private ProfileFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent build() {
        Preconditions.checkBuilderRequirement(seedInstance, ProfileFragment.class);
        return new ProfileFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ProfileFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ProfileFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent {
      private ProfileFragmentSubcomponentImpl(ProfileFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ProfileFragment arg0) {
        injectProfileFragment(arg0);
      }

      private ProfileFragment injectProfileFragment(ProfileFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        return instance;
      }
    }

    private final class ToursDetailFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeToursDetailFragment.ToursDetailFragmentSubcomponent
            .Builder {
      private ToursDetailFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeToursDetailFragment.ToursDetailFragmentSubcomponent
          build() {
        Preconditions.checkBuilderRequirement(seedInstance, ToursDetailFragment.class);
        return new ToursDetailFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ToursDetailFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ToursDetailFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeToursDetailFragment
            .ToursDetailFragmentSubcomponent {
      private ToursDetailFragmentSubcomponentImpl(ToursDetailFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ToursDetailFragment arg0) {
        injectToursDetailFragment(arg0);
      }

      private ToursDetailFragment injectToursDetailFragment(ToursDetailFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        return instance;
      }
    }

    private final class BrowseDetailFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeBrowseDetailFragment
            .BrowseDetailFragmentSubcomponent.Builder {
      private BrowseDetailFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeBrowseDetailFragment.BrowseDetailFragmentSubcomponent
          build() {
        Preconditions.checkBuilderRequirement(seedInstance, BrowseDetailFragment.class);
        return new BrowseDetailFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(BrowseDetailFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class BrowseDetailFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeBrowseDetailFragment
            .BrowseDetailFragmentSubcomponent {
      private BrowseDetailFragmentSubcomponentImpl(
          BrowseDetailFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(BrowseDetailFragment arg0) {
        injectBrowseDetailFragment(arg0);
      }

      private BrowseDetailFragment injectBrowseDetailFragment(BrowseDetailFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        return instance;
      }
    }
  }

  private final class SubMainActivitySubcomponentBuilder
      extends SubMainActivityModule_ContributeSubMainActivity.SubMainActivitySubcomponent.Builder {
    private SubMainActivity seedInstance;

    @Override
    public SubMainActivityModule_ContributeSubMainActivity.SubMainActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, SubMainActivity.class);
      return new SubMainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SubMainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SubMainActivitySubcomponentImpl
      implements SubMainActivityModule_ContributeSubMainActivity.SubMainActivitySubcomponent {
    private Provider<
            FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
                .Builder>
        toursListFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeToursSubListFragment.ToursSubListFragmentSubcomponent
                .Builder>
        toursSubListFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent.Builder>
        browseFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent.Builder>
        profileFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeToursDetailFragment.ToursDetailFragmentSubcomponent
                .Builder>
        toursDetailFragmentSubcomponentBuilderProvider;

    private Provider<
            FragmentBuildersModule_ContributeBrowseDetailFragment.BrowseDetailFragmentSubcomponent
                .Builder>
        browseDetailFragmentSubcomponentBuilderProvider;

    private SubMainActivitySubcomponentImpl(SubMainActivitySubcomponentBuilder builder) {

      initialize(builder);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(8)
          .put(
              MainActivity.class,
              (Provider) DaggerAppComponent.this.mainActivitySubcomponentBuilderProvider)
          .put(
              SubMainActivity.class,
              (Provider) DaggerAppComponent.this.subMainActivitySubcomponentBuilderProvider)
          .put(ToursListFragment.class, (Provider) toursListFragmentSubcomponentBuilderProvider)
          .put(
              ToursSubListFragment.class,
              (Provider) toursSubListFragmentSubcomponentBuilderProvider)
          .put(BrowseFragment.class, (Provider) browseFragmentSubcomponentBuilderProvider)
          .put(ProfileFragment.class, (Provider) profileFragmentSubcomponentBuilderProvider)
          .put(ToursDetailFragment.class, (Provider) toursDetailFragmentSubcomponentBuilderProvider)
          .put(
              BrowseDetailFragment.class,
              (Provider) browseDetailFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment2() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SubMainActivitySubcomponentBuilder builder) {
      this.toursListFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
                    .Builder
                get() {
              return new ToursListFragmentSubcomponentBuilder();
            }
          };
      this.toursSubListFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeToursSubListFragment.ToursSubListFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeToursSubListFragment
                    .ToursSubListFragmentSubcomponent.Builder
                get() {
              return new ToursSubListFragmentSubcomponentBuilder();
            }
          };
      this.browseFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent
                    .Builder
                get() {
              return new BrowseFragmentSubcomponentBuilder();
            }
          };
      this.profileFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
                    .Builder
                get() {
              return new ProfileFragmentSubcomponentBuilder();
            }
          };
      this.toursDetailFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeToursDetailFragment.ToursDetailFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeToursDetailFragment
                    .ToursDetailFragmentSubcomponent.Builder
                get() {
              return new ToursDetailFragmentSubcomponentBuilder();
            }
          };
      this.browseDetailFragmentSubcomponentBuilderProvider =
          new Provider<
              FragmentBuildersModule_ContributeBrowseDetailFragment.BrowseDetailFragmentSubcomponent
                  .Builder>() {
            @Override
            public FragmentBuildersModule_ContributeBrowseDetailFragment
                    .BrowseDetailFragmentSubcomponent.Builder
                get() {
              return new BrowseDetailFragmentSubcomponentBuilder();
            }
          };
    }

    @Override
    public void inject(SubMainActivity arg0) {
      injectSubMainActivity(arg0);
    }

    private SubMainActivity injectSubMainActivity(SubMainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment2());
      return instance;
    }

    private final class ToursListFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
            .Builder {
      private ToursListFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeToursListFragment.ToursListFragmentSubcomponent
          build() {
        Preconditions.checkBuilderRequirement(seedInstance, ToursListFragment.class);
        return new ToursListFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ToursListFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ToursListFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeToursListFragment
            .ToursListFragmentSubcomponent {
      private ToursListFragmentSubcomponentImpl(ToursListFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ToursListFragment arg0) {
        injectToursListFragment(arg0);
      }

      private ToursListFragment injectToursListFragment(ToursListFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance,
            SubMainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        ToursListFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ToursSubListFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeToursSubListFragment
            .ToursSubListFragmentSubcomponent.Builder {
      private ToursSubListFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeToursSubListFragment.ToursSubListFragmentSubcomponent
          build() {
        Preconditions.checkBuilderRequirement(seedInstance, ToursSubListFragment.class);
        return new ToursSubListFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ToursSubListFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ToursSubListFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeToursSubListFragment
            .ToursSubListFragmentSubcomponent {
      private ToursSubListFragmentSubcomponentImpl(
          ToursSubListFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ToursSubListFragment arg0) {
        injectToursSubListFragment(arg0);
      }

      private ToursSubListFragment injectToursSubListFragment(ToursSubListFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance,
            SubMainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        ToursSubListFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class BrowseFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent.Builder {
      private BrowseFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent build() {
        Preconditions.checkBuilderRequirement(seedInstance, BrowseFragment.class);
        return new BrowseFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(BrowseFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class BrowseFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeBrowseFragment.BrowseFragmentSubcomponent {
      private BrowseFragmentSubcomponentImpl(BrowseFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(BrowseFragment arg0) {
        injectBrowseFragment(arg0);
      }

      private BrowseFragment injectBrowseFragment(BrowseFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance,
            SubMainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        BrowseFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ProfileFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
            .Builder {
      private ProfileFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent build() {
        Preconditions.checkBuilderRequirement(seedInstance, ProfileFragment.class);
        return new ProfileFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ProfileFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ProfileFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent {
      private ProfileFragmentSubcomponentImpl(ProfileFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ProfileFragment arg0) {
        injectProfileFragment(arg0);
      }

      private ProfileFragment injectProfileFragment(ProfileFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance,
            SubMainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        return instance;
      }
    }

    private final class ToursDetailFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeToursDetailFragment.ToursDetailFragmentSubcomponent
            .Builder {
      private ToursDetailFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeToursDetailFragment.ToursDetailFragmentSubcomponent
          build() {
        Preconditions.checkBuilderRequirement(seedInstance, ToursDetailFragment.class);
        return new ToursDetailFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ToursDetailFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ToursDetailFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeToursDetailFragment
            .ToursDetailFragmentSubcomponent {
      private ToursDetailFragmentSubcomponentImpl(ToursDetailFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ToursDetailFragment arg0) {
        injectToursDetailFragment(arg0);
      }

      private ToursDetailFragment injectToursDetailFragment(ToursDetailFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance,
            SubMainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        return instance;
      }
    }

    private final class BrowseDetailFragmentSubcomponentBuilder
        extends FragmentBuildersModule_ContributeBrowseDetailFragment
            .BrowseDetailFragmentSubcomponent.Builder {
      private BrowseDetailFragment seedInstance;

      @Override
      public FragmentBuildersModule_ContributeBrowseDetailFragment.BrowseDetailFragmentSubcomponent
          build() {
        Preconditions.checkBuilderRequirement(seedInstance, BrowseDetailFragment.class);
        return new BrowseDetailFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(BrowseDetailFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class BrowseDetailFragmentSubcomponentImpl
        implements FragmentBuildersModule_ContributeBrowseDetailFragment
            .BrowseDetailFragmentSubcomponent {
      private BrowseDetailFragmentSubcomponentImpl(
          BrowseDetailFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(BrowseDetailFragment arg0) {
        injectBrowseDetailFragment(arg0);
      }

      private BrowseDetailFragment injectBrowseDetailFragment(BrowseDetailFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance,
            SubMainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        return instance;
      }
    }
  }
}
