package com.example.keyboutrd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class KeyboutrdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyboutrd)

        // Ambil tombol dari layout
        val buttonLogout = findViewById<Button>(R.id.buttonLogout)

        // Atur aksi saat tombol diklik
        buttonLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // agar tidak bisa kembali dengan tombol "back"
        }
    }
}

