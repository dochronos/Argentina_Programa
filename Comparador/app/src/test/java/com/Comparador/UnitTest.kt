package com.Comparador

import org.junit.Assert.assertEquals
import org.junit.Test

class MainViewModelTest {

    @Test
    fun testPalabrasIguales() {
        val mainViewModel = MainViewModel()
        val palabra1 = "hola"
        val palabra2 = "hola"

        mainViewModel.palabra1 = palabra1
        mainViewModel.palabra2 = palabra2
        mainViewModel.compararPalabras()

        val resultado = mainViewModel.resultado
        assertEquals("Las palabras '$palabra1' y '$palabra2' son iguales.", resultado)
    }

    @Test
    fun testPalabrasNoIguales(){
        val mainViewModel = MainViewModel()
        val palabra1 = "hola"
        val palabra2 = "mundo"

        mainViewModel.palabra1 = palabra1
        mainViewModel.palabra2 = palabra2
        mainViewModel.compararPalabras()

        val resultado = mainViewModel.resultado
        assertEquals("Las palabras '$palabra1' y '$palabra2' no son iguales.", resultado)
    }
}
