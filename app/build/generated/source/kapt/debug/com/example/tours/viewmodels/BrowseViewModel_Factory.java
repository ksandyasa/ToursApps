package com.example.tours.viewmodels;

import com.example.tours.api.RestApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BrowseViewModel_Factory implements Factory<BrowseViewModel> {
  private final Provider<RestApi> restApiProvider;

  public BrowseViewModel_Factory(Provider<RestApi> restApiProvider) {
    this.restApiProvider = restApiProvider;
  }

  @Override
  public BrowseViewModel get() {
    return provideInstance(restApiProvider);
  }

  public static BrowseViewModel provideInstance(Provider<RestApi> restApiProvider) {
    return new BrowseViewModel(restApiProvider.get());
  }

  public static BrowseViewModel_Factory create(Provider<RestApi> restApiProvider) {
    return new BrowseViewModel_Factory(restApiProvider);
  }

  public static BrowseViewModel newBrowseViewModel(RestApi restApi) {
    return new BrowseViewModel(restApi);
  }
}
