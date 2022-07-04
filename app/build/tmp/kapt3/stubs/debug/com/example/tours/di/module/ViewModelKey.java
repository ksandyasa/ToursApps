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

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/tours/di/module/ViewModelKey;", "", "value", "Lkotlin/reflect/KClass;", "Landroidx/lifecycle/ViewModel;", "()Ljava/lang/Class;", "app_debug"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Documented()
@dagger.MapKey()
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
@kotlin.annotation.MustBeDocumented()
public abstract @interface ViewModelKey {
    
    public abstract java.lang.Class<? extends androidx.lifecycle.ViewModel> value();
}