package com.example.warung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun  setpembayaran (View: View) {
        val intent = Intent (this,Activity_Pembayaran::class.java)
        startActivity (intent)
        finish()
    }
}