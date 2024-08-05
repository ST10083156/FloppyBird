package com.example.floppybird

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory

class BitmapBank {
    private lateinit var background : Bitmap
    constructor(res: Resources)
    {
        background=BitmapFactory.decodeResource(res,R.drawable.background_forest)
    }

    fun getBackground():Bitmap{
        return background
    }

    fun getBackgroundWidth():Int
    {
        return background.width
    }

    fun getBackgroundHeight():Int
    {
        return background.height
    }

}