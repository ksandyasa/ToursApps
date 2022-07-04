package com.example.tours.di.module;

import com.example.tours.features.fragments.*;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/tours/di/module/FragmentBuildersModule;", "", "()V", "contributeBrowseDetailFragment", "Lcom/example/tours/features/fragments/BrowseDetailFragment;", "contributeBrowseFragment", "Lcom/example/tours/features/fragments/BrowseFragment;", "contributeProfileFragment", "Lcom/example/tours/features/fragments/ProfileFragment;", "contributeToursDetailFragment", "Lcom/example/tours/features/fragments/ToursDetailFragment;", "contributeToursListFragment", "Lcom/example/tours/features/fragments/ToursListFragment;", "contributeToursSubListFragment", "Lcom/example/tours/features/fragments/ToursSubListFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.tours.features.fragments.ToursListFragment contributeToursListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.tours.features.fragments.ToursSubListFragment contributeToursSubListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.tours.features.fragments.BrowseFragment contributeBrowseFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.tours.features.fragments.ProfileFragment contributeProfileFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.tours.features.fragments.ToursDetailFragment contributeToursDetailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.tours.features.fragments.BrowseDetailFragment contributeBrowseDetailFragment();
    
    public FragmentBuildersModule() {
        super();
    }
}