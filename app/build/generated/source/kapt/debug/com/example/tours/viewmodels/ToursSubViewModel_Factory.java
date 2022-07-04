package com.example.tours.viewmodels;

import com.example.tours.api.RestApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ToursSubViewModel_Factory implements Factory<ToursSubViewModel> {
  private final Provider<RestApi> restApiProvider;

  public ToursSubViewModel_Factory(Provider<RestApi> restApiProvider) {
    this.restApiProvider = restApiProvider;
  }

  @Override
  public ToursSubViewModel get() {
    return provideInstance(restApiProvider);
  }

  public static ToursSubViewModel provideInstance(Provider<RestApi> restApiProvider) {
    return new ToursSubViewModel(restApiProvider.get());
  }

  public static ToursSubViewModel_Factory create(Provider<RestApi> restApiProvider) {
    return new ToursSubViewModel_Factory(restApiProvider);
  }

  public static ToursSubViewModel newToursSubViewModel(RestApi restApi) {
    return new ToursSubViewModel(restApi);
  }
}
