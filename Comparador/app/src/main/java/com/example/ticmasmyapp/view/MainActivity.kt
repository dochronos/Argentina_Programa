package com.example.ticmasmyapp.view



import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.ticmasmyapp.R
import com.example.ticmasmyapp.databinding.ActivityMainBinding

class MainActivity(val next: MainViewModel) : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var textIn: TextView
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var button1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)

        this.textIn = findViewById(R.id.textIn)
        this.editText1 = findViewById(R.id.editText1)
        this.editText2 = findViewById(R.id.editText2)
        this.button1 = findViewById(R.id.button1)

        mainViewModel.texto1.observe(this) {
            println("el valor del primer texto .$it")
        }
        mainViewModel.texto2.observe(this) {
            println("el valor del segundo texto .$it")
            comparando()
        }


    }

    @SuppressLint("SetTextI18n")
    private fun comparando() {
        binding.button1.setOnClickListener {
            if (editText1 == editText2) {
                textIn.text = "Los textos ingresados son iguales"
                return@setOnClickListener
            } else {
                textIn.text = "Los textos ingresados no coinciden"
                return@setOnClickListener
            }
        }
    }
}
/* Esto es lo que pude hacer. La app no funciona. Pero probé miles de cosas y no logro que funcione.
Tengo hecho también una app sin MVVM, pero que funciona. Espero me puedan ayudar encontrar el camino
para corregir y que funcione. Muchas gracias.
 */
