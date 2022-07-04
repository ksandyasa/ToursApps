package com.example.tours.di.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.tours.viewmodels.BrowseViewModel;
import com.example.tours.viewmodels.ToursSubViewModel;
import com.example.tours.viewmodels.ToursViewModel;
import com.example.tours.viewmodels.ViewModelFactory;
import dagger.Binds;
import dagger.MapKey;
import dagger.Module;
import dagger.multibindings.IntoMap;
import kotlin.reflect.KClass;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tours/di/module/ViewModelModule;", "", "()V", "bindBrowseViewModel", "Landroidx/lifecycle/ViewModel;", "browseViewModel", "Lcom/example/tours/viewmodels/BrowseViewModel;", "bindToursSubViewModel", "toursSubViewModel", "Lcom/example/tours/viewmodels/ToursSubViewModel;", "bindToursViewModel", "toursViewModel", "Lcom/example/tours/viewmodels/ToursViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/example/tours/viewmodels/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.example.tours.viewmodels.ToursViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindToursViewModel(@org.jetbrains.annotations.NotNull()
    com.example.tours.viewmodels.ToursViewModel toursViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.example.tours.viewmodels.ToursSubViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindToursSubViewModel(@org.jetbrains.annotations.NotNull()
    com.example.tours.viewmodels.ToursSubViewModel toursSubViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.example.tours.viewmodels.BrowseViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindBrowseViewModel(@org.jetbrains.annotations.NotNull()
    com.example.tours.viewmodels.BrowseViewModel browseViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.tours.viewmodels.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}