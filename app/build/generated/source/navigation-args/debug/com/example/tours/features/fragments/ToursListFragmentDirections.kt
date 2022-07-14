package com.example.tours.features.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.tours.R
import com.example.tours.model.Tour
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ToursListFragmentDirections private constructor() {
  private data class ToSubMainActivity(
    public val `data`: Tour
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.to_subMainActivity

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun toSubMainActivity(`data`: Tour): NavDirections = ToSubMainActivity(data)
  }
}
