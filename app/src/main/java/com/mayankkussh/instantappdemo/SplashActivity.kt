package com.mayankkussh.instantappdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mayankkussh.instantappdemo.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivitySplashBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.imageView.postDelayed({
      val intent = intent
      val action = intent.action

      startActivity(Intent(this, ProductDetailPage::class.java))
      finish()
    }, 2000)
  }
}