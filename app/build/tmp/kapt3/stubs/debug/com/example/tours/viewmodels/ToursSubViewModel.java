package com.example.tours.viewmodels;

import androidx.lifecycle.ViewModel;
import com.example.tours.api.RestApi;
import com.example.tours.model.Tour;
import io.reactivex.Observable;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/tours/viewmodels/ToursSubViewModel;", "Landroidx/lifecycle/ViewModel;", "restApi", "Lcom/example/tours/api/RestApi;", "(Lcom/example/tours/api/RestApi;)V", "loadToursSubData", "Lio/reactivex/Observable;", "", "Lcom/example/tours/model/Tour;", "app_debug"})
public final class ToursSubViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.tours.api.RestApi restApi = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.example.tours.model.Tour>> loadToursSubData() {
        return null;
    }
    
    @javax.inject.Inject()
    public ToursSubViewModel(@org.jetbrains.annotations.NotNull()
    com.example.tours.api.RestApi restApi) {
        super();
    }
}