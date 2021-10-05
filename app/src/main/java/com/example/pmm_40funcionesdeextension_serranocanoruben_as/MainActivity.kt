package com.example.pmm_40funcionesdeextension_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_40funcionesdeextension_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mensaje = "Este es el mensaje\n"
        val resultado0 = "Primera mitad: ${mensaje.primeraMitad()}\n"
        val resultado1 = "Segunda mitad: ${mensaje.segundaMitad()}\n"
        binding.tvResultado10.text = mensaje
            .plus(resultado0)
            .plus(resultado1)
    }
}
fun String.primeraMitad(): String {
    return this.substring(0 until this.length/2)
}
fun String.segundaMitad(): String{
    return this.substring(this.length/2 until this.length)
}