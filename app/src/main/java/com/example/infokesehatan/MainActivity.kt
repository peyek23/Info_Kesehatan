package com.example.infokesehatan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.infokesehatan.databinding.ActivityMainBinding
import com.example.infokesehatan.databinding.ActivitySignUpBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profil.setOnClickListener {
            val intent = Intent(this, profil::class.java)
            startActivity(intent)
            return@setOnClickListener
        }
        binding.lihatsemuariwayat.setOnClickListener {
            val intent = Intent(this, riwayat::class.java)
            startActivity(intent)
            return@setOnClickListener
        }
        binding.daftar.setOnClickListener {
            val intent = Intent(this, daftar::class.java)
            startActivity(intent)
            return@setOnClickListener
        }
    }

}