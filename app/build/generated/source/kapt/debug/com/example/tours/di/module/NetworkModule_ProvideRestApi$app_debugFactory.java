package com.example.tours.di.module;

import com.example.tours.api.RestApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideRestApi$app_debugFactory implements Factory<RestApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideRestApi$app_debugFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RestApi get() {
    return provideInstance(retrofitProvider);
  }

  public static RestApi provideInstance(Provider<Retrofit> retrofitProvider) {
    return proxyProvideRestApi$app_debug(retrofitProvider.get());
  }

  public static NetworkModule_ProvideRestApi$app_debugFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideRestApi$app_debugFactory(retrofitProvider);
  }

  public static RestApi proxyProvideRestApi$app_debug(Retrofit retrofit) {
    return Preconditions.checkNotNull(
        NetworkModule.provideRestApi$app_debug(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
