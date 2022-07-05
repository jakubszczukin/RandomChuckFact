package com.example.randomchuckfact.data.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("app:setCoilImageUrl")
fun loadImage(view : ImageView, url : String?){
    if(url != null){
        view.load(url){
            crossfade(true)
        }
    }
}