package com.example.ester_rm89350

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcula = findViewById<Button>(R.id.btnCalcula)

        val inputKm = findViewById<EditText>(R.id.inputKm)
        val inputpreco = findViewById<EditText>(R.id.inputPreco)
        val inputGasto = findViewById<EditText>(R.id.inputGasto)

        val resultado = findViewById<TextView>(R.id.resultado)

        btnCalcula.setOnClickListener{
            val retorno = (inputKm.text.toString().toFloat() * inputpreco.text.toString().toFloat()) / inputGasto.text.toString().toFloat()
            resultado.text = "R$ ${retorno}"
        }
    }
}