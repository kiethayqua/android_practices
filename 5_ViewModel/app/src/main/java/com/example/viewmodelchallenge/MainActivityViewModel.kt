package com.example.viewmodelchallenge

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {
    private var total = 0

    init {
        total = startingTotal
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotal(number: Int) {
        total += number
    }
}