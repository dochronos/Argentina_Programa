package com.Comparador

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var palabra1: String = ""
    var palabra2: String = ""
    var resultado: String = ""

    fun compararPalabras() {
        resultado = if (palabra1 == palabra2) {
            "Las palabras '$palabra1' y '$palabra2' son iguales."
        } else {
            "Las palabras '$palabra1' y '$palabra2' no son iguales."
        }
    }

    fun limpiarCampos() {
        palabra1 = ""
        palabra2 = ""
        resultado = ""
    }
}
