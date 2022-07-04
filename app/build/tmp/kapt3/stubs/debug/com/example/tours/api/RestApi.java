package com.example.tours.api;

import com.example.tours.model.Photo;
import com.example.tours.model.Tour;
import io.reactivex.Observable;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/tours/api/RestApi;", "", "getPhotosData", "Lio/reactivex/Observable;", "", "Lcom/example/tours/model/Photo;", "getTourData", "Lcom/example/tours/model/Tour;", "app_debug"})
public abstract interface RestApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/photos")
    public abstract io.reactivex.Observable<java.util.List<com.example.tours.model.Photo>> getPhotosData();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/tour")
    public abstract io.reactivex.Observable<java.util.List<com.example.tours.model.Tour>> getTourData();
}