package com.example.aidar_badirov_hw_3_7

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.firstContainer, FirstFragment()).commit()
            supportFragmentManager.beginTransaction().add(R.id.secondContainer, SecondFragment()).commit()
        }
    }
}