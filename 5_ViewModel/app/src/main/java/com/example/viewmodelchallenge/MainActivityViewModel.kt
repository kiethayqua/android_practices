package com.example.viewmodelchallenge

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var total = 0

    fun getTotal(): Int {
        return total
    }

    fun setTotal(number: Int) {
        total += number
    }
}