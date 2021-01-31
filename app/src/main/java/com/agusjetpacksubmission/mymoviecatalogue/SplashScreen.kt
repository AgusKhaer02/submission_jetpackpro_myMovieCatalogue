package com.agusjetpacksubmission.mymoviecatalogue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.agusjetpacksubmission.mymoviecatalogue.databinding.ActivitySplashScreenBinding
import com.agusjetpacksubmission.mymoviecatalogue.home.HomeActivity

class SplashScreen : AppCompatActivity() {
    private lateinit var handler : Handler
    private lateinit var binding : ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        @Suppress("DEPRECATION")
        handler = Handler()

        handler.postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            this.finish()
        }, 3000)

    }
}