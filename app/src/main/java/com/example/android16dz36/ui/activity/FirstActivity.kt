package com.example.android16dz36.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android16dz36.R
import com.example.android16dz36.databinding.ActivityFirstBinding
class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        passwordListener()
    }

    private fun passwordListener() {
        val password = "123"
        binding.button.setOnClickListener {
            val text = binding.etPassword.text.toString()
            if (text == password) {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Неверный пароль овощь", Toast.LENGTH_SHORT).show()
            }
        }
    }
}



