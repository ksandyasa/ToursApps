package com.example.tours.features.adapters;

import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007\u00a8\u0006\n"}, d2 = {"loadImage", "", "view", "Landroid/widget/ImageView;", "url", "", "setCountText", "Landroid/widget/TextView;", "text", "setTitleText", "app_debug"})
public final class BindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"titleText"})
    public static final void setTitleText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"countText"})
    public static final void setCountText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
}