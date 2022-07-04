package com.example.tours.features.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tours.databinding.ToursItemBinding;
import com.example.tours.model.Photo;
import com.example.tours.model.Tour;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0014\u0010\u0014\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\nR \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/tours/features/adapters/ToursAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/tours/features/adapters/ToursAdapter$ViewHolder;", "navigate", "Lkotlin/Function2;", "Lcom/example/tours/model/Tour;", "Landroid/widget/ImageView;", "", "(Lkotlin/jvm/functions/Function2;)V", "toursList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateToursList", "list", "ViewHolder", "app_debug"})
public final class ToursAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.tours.features.adapters.ToursAdapter.ViewHolder> {
    private java.util.List<com.example.tours.model.Tour> toursList;
    private final kotlin.jvm.functions.Function2<com.example.tours.model.Tour, android.widget.ImageView, kotlin.Unit> navigate = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.tours.features.adapters.ToursAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.tours.features.adapters.ToursAdapter.ViewHolder holder, int position) {
    }
    
    public final void updateToursList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.tours.model.Tour> list) {
    }
    
    public ToursAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.tours.model.Tour, ? super android.widget.ImageView, kotlin.Unit> navigate) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/tours/features/adapters/ToursAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/tours/databinding/ToursItemBinding;", "(Lcom/example/tours/features/adapters/ToursAdapter;Lcom/example/tours/databinding/ToursItemBinding;)V", "bind", "", "data", "Lcom/example/tours/model/Tour;", "position", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.tours.databinding.ToursItemBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.tours.model.Tour data, int position) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.tours.databinding.ToursItemBinding binding) {
            super(null);
        }
    }
}