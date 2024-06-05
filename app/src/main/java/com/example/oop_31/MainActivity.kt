package com.example.oop_31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oop_31.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, SecondActivity::class.java)

        binding.btColorWhite.setOnClickListener {
            intent.putExtra("color", "white")
            startActivity(intent)
        }
        binding.btColorRed.setOnClickListener {
            intent.putExtra("color", "red")
            startActivity(intent)
        }
        binding.btColorBlue.setOnClickListener {
            intent.putExtra("color", "blue")
            startActivity(intent)
        }
        binding.btColorGreen.setOnClickListener {
            intent.putExtra("color", "green")
            startActivity(intent)
        }
        binding.btColorCyan.setOnClickListener {
            intent.putExtra("color", "cyan")
            startActivity(intent)
        }
        binding.btColorLtGray.setOnClickListener {
            intent.putExtra("color", "lightgray")
            startActivity(intent)
        }
        binding.btColorMagenta.setOnClickListener {
            intent.putExtra("color", "magenta")
            startActivity(intent)
        }
    }
}