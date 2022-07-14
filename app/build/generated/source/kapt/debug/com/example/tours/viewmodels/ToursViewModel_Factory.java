package com.example.tours.viewmodels;

import com.example.tours.api.RestApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ToursViewModel_Factory implements Factory<ToursViewModel> {
  private final Provider<RestApi> restApiProvider;

  public ToursViewModel_Factory(Provider<RestApi> restApiProvider) {
    this.restApiProvider = restApiProvider;
  }

  @Override
  public ToursViewModel get() {
    return provideInstance(restApiProvider);
  }

  public static ToursViewModel provideInstance(Provider<RestApi> restApiProvider) {
    return new ToursViewModel(restApiProvider.get());
  }

  public static ToursViewModel_Factory create(Provider<RestApi> restApiProvider) {
    return new ToursViewModel_Factory(restApiProvider);
  }

  public static ToursViewModel newToursViewModel(RestApi restApi) {
    return new ToursViewModel(restApi);
  }
}
