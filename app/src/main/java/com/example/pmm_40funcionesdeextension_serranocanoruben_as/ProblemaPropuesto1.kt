package com.example.pmm_40funcionesdeextension_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_40funcionesdeextension_serranocanoruben_as.databinding.ActivityProblemaPropuesto1Binding

class ProblemaPropuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto1)

        val binding = ActivityProblemaPropuesto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mensaje = "Esta es la String"
        binding.tvResultado30.text = mensaje.resultado()

    }
    fun String.resultado():String{
        return this
    }
}