package com.Comparador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.curso.android.app.practica.proyectofinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(application))[MainViewModel::class.java]

        binding.compareBtn.setOnClickListener {
            viewModel.palabra1 = binding.editText.text.toString()
            viewModel.palabra2 = binding.editText1.text.toString()
            viewModel.compararPalabras()
            binding.resultText.text = viewModel.resultado
        }

        binding.clearBtn.setOnClickListener {
            viewModel.limpiarCampos()
            binding.editText.text.clear()
            binding.editText1.text.clear()
            binding.resultText.text = ""
        }
    }
}










