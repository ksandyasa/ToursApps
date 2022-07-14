package com.example.tours.di.module;

import com.example.tours.utils.MockClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideOkHttpClient$app_debugFactory
    implements Factory<OkHttpClient> {
  private final Provider<MockClient> interceptorProvider;

  public NetworkModule_ProvideOkHttpClient$app_debugFactory(
      Provider<MockClient> interceptorProvider) {
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideInstance(interceptorProvider);
  }

  public static OkHttpClient provideInstance(Provider<MockClient> interceptorProvider) {
    return proxyProvideOkHttpClient$app_debug(interceptorProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClient$app_debugFactory create(
      Provider<MockClient> interceptorProvider) {
    return new NetworkModule_ProvideOkHttpClient$app_debugFactory(interceptorProvider);
  }

  public static OkHttpClient proxyProvideOkHttpClient$app_debug(MockClient interceptor) {
    return Preconditions.checkNotNull(
        NetworkModule.provideOkHttpClient$app_debug(interceptor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
