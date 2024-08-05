package com.example.floppybird

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
AppConstants.initialization(this.applicationContext)
        }

    fun  startGame(view: View)
   {
        Log.i("ImageButton","Clicked")
       var intent = Intent(this,GameActivity::class.java)
       startActivity(intent)
       finish()
   }

}
