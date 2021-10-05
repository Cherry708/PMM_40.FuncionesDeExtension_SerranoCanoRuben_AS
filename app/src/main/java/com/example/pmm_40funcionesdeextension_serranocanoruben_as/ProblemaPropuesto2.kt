package com.example.pmm_40funcionesdeextension_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_40funcionesdeextension_serranocanoruben_as.databinding.ActivityProblemaPropuesto2Binding

class ProblemaPropuesto2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto2)

        val binding = ActivityProblemaPropuesto2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvResultado40.text = 1.hasta(10)
    }

    fun Int.hasta(fin: Int):String {
        var resultado = ""
        for(entero in this..fin)
            resultado += "$entero "
        return resultado
    }

}