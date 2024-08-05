package com.example.floppybird

import android.app.Activity
import android.os.Bundle

class GameActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var gameView = GameView(this)
        setContentView(gameView)
    }
}