package com.example.tours.di.module;

import android.app.Application;
import com.example.tours.api.RestApi;
import com.example.tours.utils.MockClient;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\u00a2\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/example/tours/di/module/NetworkModule;", "", "()V", "provideMockClient", "Lcom/example/tours/utils/MockClient;", "app", "Landroid/app/Application;", "provideMockClient$app_debug", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "interceptor", "provideOkHttpClient$app_debug", "provideRestApi", "Lcom/example/tours/api/RestApi;", "retrofit", "Lretrofit2/Retrofit;", "provideRestApi$app_debug", "provideRetrofitInterface", "client", "provideRetrofitInterface$app_debug", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.tours.di.module.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public static final com.example.tours.api.RestApi provideRestApi$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public static final retrofit2.Retrofit provideRetrofitInterface$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public static final okhttp3.OkHttpClient provideOkHttpClient$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.tours.utils.MockClient interceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public static final com.example.tours.utils.MockClient provideMockClient$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}