package com.example.floppybird

import android.content.Context
import android.view.SurfaceHolder
import android.view.SurfaceView

class GameView(context: Context): SurfaceView(context), SurfaceHolder.Callback{

    private lateinit var gameThread: GameThread

    init {
        initView()
    }
    override fun surfaceCreated(holder: SurfaceHolder) {
        if(!gameThread.isRunning()){
            gameThread = GameThread(holder)
            gameThread.start()
        }
        else{
            gameThread.start()
        }
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        TODO("Not yet implemented")
    }

    override fun surfaceDestroyed(holder: SurfaceHolder) {
if(gameThread.isRunning()){
    gameThread.isRunning = false
    var retry : Boolean = true
    while(retry){
        try{
            gameThread.join()
            retry=false
        }
        catch(e:InterruptedException){}
    }
}
    }
fun initView(){
    var holder : SurfaceHolder = getHolder()
    holder.addCallback(this)
    isFocusable=true
    gamethread = GameThread(holder)
}
}