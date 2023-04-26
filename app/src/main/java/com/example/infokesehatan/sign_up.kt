package com.example.infokesehatan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.infokesehatan.databinding.ActivitySignUpBinding

class sign_up : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnsignup.setOnClickListener {
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(
                this,
                "Berhasil daftar!", Toast.LENGTH_SHORT
            ).show()
        }

    }
}