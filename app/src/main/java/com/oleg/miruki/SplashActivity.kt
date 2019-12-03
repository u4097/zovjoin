package com.oleg.miruki

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startApp()
    }


    open fun startApp(){
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }

}