package com.example.pmm_40funcionesdeextension_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_40funcionesdeextension_serranocanoruben_as.databinding.ActivityProblema2Binding

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEnteros = IntArray(5){(1..10).random()}

        binding.tvResultado20.text = listaEnteros.mostrar()

    }
    fun IntArray.mostrar():String {
        var string = ""
        for(elemento in this) {
            string += "[$elemento]"
        }
        return string
    }
}