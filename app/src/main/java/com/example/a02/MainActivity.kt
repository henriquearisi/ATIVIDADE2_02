package com.example.a02
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.a02.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numero1 = findViewById<EditText>(R.id.numero1)  // Correção aqui
        val numero2 = findViewById<EditText>(R.id.numero2)
        val somarBtn = findViewById<Button>(R.id.somarBtn)
        val subtrairBtn = findViewById<Button>(R.id.subtrairBtn)
        val resultado = findViewById<TextView>(R.id.resultado)

        somarBtn.setOnClickListener {
            val num1 = numero1.text.toString()
            val num2 = numero2.text.toString()

            if (num1.isNotEmpty() && num2.isNotEmpty()) {
                val soma = num1.toDouble() + num2.toDouble()
                resultado.text = "Resultado: $soma"
            } else {
                resultado.text = "Por favor, insira ambos os números."
            }
        }

        subtrairBtn.setOnClickListener {
            val num1 = numero1.text.toString()
            val num2 = numero2.text.toString()

            if (num1.isNotEmpty() && num2.isNotEmpty()) {
                val subtracao = num1.toDouble() - num2.toDouble()
                resultado.text = "Resultado: $subtracao"
            } else {
                resultado.text = "Por favor, insira ambos os números."
            }
        }
    }
}
