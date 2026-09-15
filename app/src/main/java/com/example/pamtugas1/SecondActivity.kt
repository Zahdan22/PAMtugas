package com.example.pamtugas1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textHasil = findViewById<TextView>(R.id.textHasil)

        val pesan = intent.getStringExtra("pesan")

        textHasil.text = pesan
    }
}