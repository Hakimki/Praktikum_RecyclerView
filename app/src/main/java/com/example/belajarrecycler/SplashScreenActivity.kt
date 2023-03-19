package com.example.belajarrecycler

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SplashScreenActivity : AppCompatActivity() {

    private lateinit var handphone_logo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handphone_logo = findViewById(R.id.handphone_logo)
        handphone_logo.alpha = 0f
        handphone_logo.animate().setDuration(1500).alpha(1f).withEndAction{

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }





    }
}