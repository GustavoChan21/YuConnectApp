package com.gcdev.yuconnect

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.gcdev.yuconnect.authentication.AuthActivity

class IntroScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_screen)

        val sharedPref = getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val isLoggedIn = sharedPref.getBoolean("isLoggedIn", false)
        if (isLoggedIn) {
            // El usuario ya ha iniciado sesión anteriormente, omitir la actividad de inicio de sesión
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        val btnLogin: AppCompatButton = findViewById(R.id.btnLogIn)
        btnLogin.setOnClickListener{
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }

        val btnGuestAcces: AppCompatButton = findViewById(R.id.btnGuestAccess)
        btnGuestAcces.setOnClickListener{
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
        }

        val tvRegister = findViewById<TextView>(R.id.tvRegister_intro)
        tvRegister.setOnClickListener{
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }

        //SplashScreen Code

    }
}