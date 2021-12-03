package com.example.expresionjoven

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreen_app : AppCompatActivity() {
    companion object {
        const val TIME_SPLASH_SCREEN = 1000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.splashscreen_design)

    }

    private fun salirSplashScreen () {
    Handler(Looper.getMainLooper()).postDelayed({
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.bounce_interpolator,android.R.anim.cycle_interpolator)
        this.finish()}, TIME_SPLASH_SCREEN)

    }

}