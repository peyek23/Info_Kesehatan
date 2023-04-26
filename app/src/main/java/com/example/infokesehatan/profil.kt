package com.example.infokesehatan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.infokesehatan.databinding.ActivityMainBinding
import com.example.infokesehatan.databinding.ActivityProfilBinding

class profil : AppCompatActivity() {

    private lateinit var binding: ActivityProfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.keluar.setOnClickListener {
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(
                this,
                "Berhasil keluar!", Toast.LENGTH_SHORT
            ).show()
        }
    }
}