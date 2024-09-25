package com.example.projectmvvm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var contador by mutableStateOf(0)
        private set

    var backgroundColocar by mutableStateOf(Color.White)
        private set

    fun incrementarContador() {
        contador++
        when (contador) {
            in 1 .. 5 -> backgroundColocar = Color.Yellow
            in 6 .. 10 -> backgroundColocar = Color.Cyan
            else -> backgroundColocar = Color.Red
        }
    }
}