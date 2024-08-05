package com.example.floppybird

class BackgroundImage {

    private var backgroundImageX : Int = 0
    private var backgroundImageY : Int = 0
    private var backgroundImageVelocity : Int = 3

    constructor()

    fun getX(): Int{
        return backgroundImageX
    }
    fun getY(): Int{
        return backgroundImageY
    }
    fun setX(backgroundImageX:Int){
        this.backgroundImageX=backgroundImageX
    }
    fun setY(backgroundImageY:Int){
        this.backgroundImageY=backgroundImageY
    }
    fun getVelocity():Int{
        return backgroundImageVelocity
    }
}