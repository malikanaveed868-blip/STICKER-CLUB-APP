package com.example.stickerclubapp2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openButton = findViewById<Button>(R.id.btn_open)
        openButton.setOnClickListener {
            Toast.makeText(this, "Welcome to Sticker Club", Toast.LENGTH_SHORT).show()
        }
    }
}