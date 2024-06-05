package com.example.oop_31

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oop_31.databinding.ActivitySecond2Binding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecond2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val color = intent.getStringExtra("color")

        if (color.equals("white")) binding.clSecondRoot.setBackgroundColor(Color.WHITE)
        else if (color.equals("red")) binding.clSecondRoot.setBackgroundColor(Color.RED)
        else if (color.equals("blue")) binding.clSecondRoot.setBackgroundColor(Color.BLUE)
        else if (color.equals("green")) binding.clSecondRoot.setBackgroundColor(Color.GREEN)
        else if (color.equals("cyan")) binding.clSecondRoot.setBackgroundColor(Color.CYAN)
        else if (color.equals("lightgray")) binding.clSecondRoot.setBackgroundColor(Color.LTGRAY)
        else if (color.equals("magenta")) binding.clSecondRoot.setBackgroundColor(Color.MAGENTA)
        else binding.clSecondRoot.setBackgroundColor(Color.WHITE)
    }
}