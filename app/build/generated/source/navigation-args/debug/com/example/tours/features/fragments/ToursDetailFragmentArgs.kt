package com.example.tours.features.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.tours.model.Tour
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ToursDetailFragmentArgs(
  public val `data`: Tour
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Tour::class.java)) {
      result.putParcelable("data", this.data as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Tour::class.java)) {
      result.putSerializable("data", this.data as Serializable)
    } else {
      throw UnsupportedOperationException(Tour::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ToursDetailFragmentArgs {
      bundle.setClassLoader(ToursDetailFragmentArgs::class.java.classLoader)
      val __data : Tour?
      if (bundle.containsKey("data")) {
        if (Parcelable::class.java.isAssignableFrom(Tour::class.java) ||
            Serializable::class.java.isAssignableFrom(Tour::class.java)) {
          __data = bundle.get("data") as Tour?
        } else {
          throw UnsupportedOperationException(Tour::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__data == null) {
          throw IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue")
      }
      return ToursDetailFragmentArgs(__data)
    }
  }
}
