package com.wheeliechamp.bindingadapter

import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.SimpleDateFormat
import com.squareup.picasso.Picasso
import java.util.*

object BindingAdapters {

    @BindingAdapter("imageUrl", "error")
    @JvmStatic
    fun loadImage(view: ImageView, url:String, drawable: Drawable){
        Picasso.get().load(url).error(drawable).into(view)
    }

    @BindingAdapter("convertDate")
    @JvmStatic
    fun convertDate(view: TextView, date: Date){
        view.text = SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(date)
    }
}