package com.example.databindingexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.submitButton.setOnClickListener {
            displayName()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun displayName() {
//        binding.myName.text = "Hello, I am ${binding.nameTextInput.text}"
        binding.apply {
            myName.text = "Hello, I am ${nameTextInput.text}"
        }
    }
}