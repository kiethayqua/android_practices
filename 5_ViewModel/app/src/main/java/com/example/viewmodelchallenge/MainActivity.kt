package com.example.viewmodelchallenge

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.viewmodelchallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.apply {
            result.text = viewModel.getTotal().toString()

            addButton.setOnClickListener {
                onClickAddNumber()
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun onClickAddNumber() {
        binding.apply {
            viewModel.setTotal(numberInput.text.toString().toInt())
            result.text = viewModel.getTotal().toString()
        }
    }
}