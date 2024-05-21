package com.example.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.constraintlayout.databinding.ActivityMainChainsBinding

class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainCircleBinding
    private lateinit var binding: ActivityMainChainsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainChainsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}