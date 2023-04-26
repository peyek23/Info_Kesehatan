package com.example.infokesehatan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.infokesehatan.databinding.ActivitySignInBinding

class signin : AppCompatActivity() {

    private lateinit var binding:ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(
                this,
                "Berhasil masuk!", Toast.LENGTH_SHORT
            ).show()

        }
            binding.daftar.setOnClickListener {
                val intent = Intent(this, sign_up::class.java)
                startActivity(intent)
            }
        }

    }
