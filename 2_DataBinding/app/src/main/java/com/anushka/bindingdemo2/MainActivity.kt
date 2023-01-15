package com.anushka.bindingdemo2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        button = binding.controlButton
        button.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun startOrStopProgressBar() {
        val progressBar = binding.progressBar
        if (progressBar.visibility == View.GONE) {
            progressBar.visibility = View.VISIBLE
            button.text = "Stop"
        } else {
            progressBar.visibility = View.GONE
            button.text = "Start"
        }
    }
}