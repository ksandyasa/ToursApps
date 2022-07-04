package com.example.tours.di.module;

import android.app.Application;
import com.example.tours.utils.MockClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideMockClient$app_debugFactory implements Factory<MockClient> {
  private final Provider<Application> appProvider;

  public NetworkModule_ProvideMockClient$app_debugFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public MockClient get() {
    return provideInstance(appProvider);
  }

  public static MockClient provideInstance(Provider<Application> appProvider) {
    return proxyProvideMockClient$app_debug(appProvider.get());
  }

  public static NetworkModule_ProvideMockClient$app_debugFactory create(
      Provider<Application> appProvider) {
    return new NetworkModule_ProvideMockClient$app_debugFactory(appProvider);
  }

  public static MockClient proxyProvideMockClient$app_debug(Application app) {
    return Preconditions.checkNotNull(
        NetworkModule.provideMockClient$app_debug(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
