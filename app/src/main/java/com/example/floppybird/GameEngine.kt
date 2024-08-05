package com.example.floppybird

import android.graphics.Canvas

class GameEngine {
    private lateinit var backgroundImage: BackgroundImage
    constructor(){
        backgroundImage = BackgroundImage()
    }

    fun updateAndDrawBackgroundImage(canvas: Canvas){
        backgroundImage.setX(backgroundImage.getX()- backgroundImage.getVelocity())
        if(backgroundImage.getX()<(-AppConstants.getBitmapBank().getBackgroundWidth()))
        {

            backgroundImage.setX(0)

        }
        canvas.drawBitmap(AppConstants.getBitmapBank().getBackground(),backgroundImage.getX(),backgroundImage.getY(),null)
    }
}