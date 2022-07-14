package com.example.tours.di.module;

import dagger.Module;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/tours/di/module/AppModule;", "", "()V", "app_debug"})
@dagger.Module(includes = {com.example.tours.di.module.ViewModelModule.class, com.example.tours.di.module.NetworkModule.class})
public final class AppModule {
    
    public AppModule() {
        super();
    }
}