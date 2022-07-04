package com.example.tours.features.fragments;

import androidx.fragment.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProfileFragment_MembersInjector implements MembersInjector<ProfileFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  public ProfileFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
  }

  public static MembersInjector<ProfileFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider) {
    return new ProfileFragment_MembersInjector(childFragmentInjectorProvider);
  }

  @Override
  public void injectMembers(ProfileFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
  }
}
