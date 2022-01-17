package com.example.composition_of_numbers.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.composition_of_numbers.R
import com.example.composition_of_numbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}