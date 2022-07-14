package com.example.tours.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideRetrofitInterface$app_debugFactory
    implements Factory<Retrofit> {
  private final Provider<OkHttpClient> clientProvider;

  public NetworkModule_ProvideRetrofitInterface$app_debugFactory(
      Provider<OkHttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit get() {
    return provideInstance(clientProvider);
  }

  public static Retrofit provideInstance(Provider<OkHttpClient> clientProvider) {
    return proxyProvideRetrofitInterface$app_debug(clientProvider.get());
  }

  public static NetworkModule_ProvideRetrofitInterface$app_debugFactory create(
      Provider<OkHttpClient> clientProvider) {
    return new NetworkModule_ProvideRetrofitInterface$app_debugFactory(clientProvider);
  }

  public static Retrofit proxyProvideRetrofitInterface$app_debug(OkHttpClient client) {
    return Preconditions.checkNotNull(
        NetworkModule.provideRetrofitInterface$app_debug(client),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
