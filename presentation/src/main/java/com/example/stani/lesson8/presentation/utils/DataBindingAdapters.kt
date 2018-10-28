package com.example.stani.lesson8.presentation.utils

import android.databinding.BindingAdapter
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.stani.lesson8.R

@BindingAdapter("app:src")
fun loadImage(view: ImageView, imageUrl: String) {
    val errorImageView :Drawable? = view.resources.getDrawable( R.drawable.ic_launcher)
    val options = RequestOptions()
            .circleCrop()
            .error(errorImageView)

    Glide.with(view.context)
            .load(imageUrl)
            .apply(options)
            .into(view)
}

@BindingAdapter("android:background")
fun View.background(isMan: Boolean) {
    val manColor = ColorDrawable(0x644da5f2)
    val womanColor = ColorDrawable(0x64de53b4)
    this.background = if (isMan) manColor else womanColor
}