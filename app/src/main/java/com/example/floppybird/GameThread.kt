package com.example.floppybird

import android.graphics.Canvas
import android.os.SystemClock
import android.util.Log
import android.view.SurfaceHolder

class GameThread : Thread {
    var isRunning : Boolean = false
    private var startTime : Long = SystemClock.uptimeMillis()
    private var loopTime : Long = SystemClock.uptimeMillis()
    private var DELAY = 33
    private lateinit var surfaceHolder: SurfaceHolder

    constructor(surfaceHolder: SurfaceHolder){
        this.surfaceHolder = surfaceHolder
        isRunning = true
    }

    override fun run(){
         while(isRunning)
         {
             startTime=SystemClock.uptimeMillis()

             var canvas: Canvas = surfaceHolder.lockCanvas(null)
             if(canvas!=null){
                 synchronized(surfaceHolder){
                     AppConstants.getGameEngine().updateAndDrawBackgroundImage(canvas)
                     surfaceHolder.unlockCanvasAndPost(canvas)
                 }
             }

             loopTime = SystemClock.uptimeMillis()-startTime
             if(loopTime < DELAY){
                 try{
                     Thread.sleep(DELAY-loopTime)
                 }
                 catch(e:InterruptedException)
                 {
                     Log.e("Interrupted","Interrupted while sleeping")
                 }
             }
         }
    }

    fun isRunning():Boolean{
        return isRunning
    }

    fun setIsRunning(state:Boolean)
    {
        isRunning=state
    }
}