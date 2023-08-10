package com.reymond.myappderivada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fx = "5x^2 - x^2 + 10 - x"
        /
    }


















   /* fun derivarFuncion(funcionOriginal: String): String
    {
            val terminos = funcionOriginal.split(" + ", " - ").map { it.trim() }
            val signos = funcionOriginal.map { it == '+' || it == '-' }.mapIndexed{ index, present ->
            if (present) funcionOriginal[index] else null }.filterNotNull()
            val derivados = terminos.mapIndexed { index, termino ->
            val signo = if (index < signos.size) signos[index].toString() else ""
            val coeficiente = termino.substringBefore("x").trim().toIntOrNull() ?: 1
            val exponente = termino.substringAfter("^").trim().toIntOrNull() ?: 1
            val derivadoCoeficiente = coeficiente * exponente
            val derivadoExponente = exponente - 1

            when (derivadoExponente)
            {
                0 -> "$signo$derivadoCoeficiente"
                1 -> "$signo${derivadoCoeficiente}x"
                else -> "$signo$derivadoCoeficiente x^$derivadoExponente"
            }
        }
        return derivados.joinToString(" ")
    }*/
    }


