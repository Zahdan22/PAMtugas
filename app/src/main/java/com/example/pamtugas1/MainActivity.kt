package com.example.pamtugas1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPesan = findViewById<EditText>(R.id.editTextPesan)
        val buttonKirim = findViewById<Button>(R.id.buttonKirim)

        buttonKirim.setOnClickListener {
            val pesan = editTextPesan.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("pesan", pesan)
            startActivity(intent)
        }
    }
}