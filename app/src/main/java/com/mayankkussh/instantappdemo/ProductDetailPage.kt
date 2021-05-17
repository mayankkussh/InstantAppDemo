package com.mayankkussh.instantappdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProductDetailPage : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_product_detail_page)
  }

  override fun onBackPressed() {
    startActivity(Intent(this, MeraLinkHomePage::class.java))
    super.onBackPressed()
  }
}