package com.gcdev.yuconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.gcdev.yuconnect.view.GifImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val gifImageView = findViewById<GifImageView>(R.id.gifImageView) as GifImageView

        gifImageView.setGifImageResource(R.drawable.sc_yuconnect)

        try {
            Handler().postDelayed({
                val mInt = Intent(this, IntroScreenActivity::class.java)
                startActivity(mInt)
                finish()
            }, 5200)
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
}