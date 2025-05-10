package com.example.keyboutrd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class registerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val username = findViewById<EditText>(R.id.editTextNewUsername)
        val password = findViewById<EditText>(R.id.editTextNewPassword)
        val button = findViewById<Button>(R.id.buttonRegisterSave)

        button.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()

            if (user.isNotEmpty() && pass.isNotEmpty()) {
                val sharedPref = getSharedPreferences("userData", MODE_PRIVATE)
                sharedPref.edit().apply {
                    putString("username", user)
                    putString("password", pass)
                    apply()
                }
                Toast.makeText(this, "Pendaftaran berhasil", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, loginActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Isi semua data", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
