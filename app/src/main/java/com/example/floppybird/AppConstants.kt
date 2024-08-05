package com.example.floppybird

import android.content.Context

class AppConstants {
companion object{
  lateinit var bitmapBank:BitmapBank
  lateinit var gameEngine:GameEngine
  fun initialization(context:Context){
      bitmapBank= BitmapBank(context.resources)
      gameEngine = GameEngine()

  }
    fun getBitmapBank():BitmapBank{
        return bitmapBank
    }
    fun getGameEngine():GameEngine{
        return gameEngine
    }
}


}