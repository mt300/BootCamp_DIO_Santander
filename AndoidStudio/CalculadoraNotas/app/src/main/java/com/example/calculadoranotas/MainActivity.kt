package com.example.calculadoranotas

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btCalcular: Button = button
        val result: TextView = resultView



        btCalcular.setOnClickListener{
            val nota1 = Integer.parseInt(notaField1.text.toString())
            val nota2 = Integer.parseInt(notaField2.text.toString())
            val absence = Integer.parseInt(faltasField.text.toString())
            val mean: Int = (nota1 + nota2)/2

            if(mean >= 6 && absence <= 10)
            {
                result.text = "Congrats!! You are approved with mean $mean"
                result.setTextColor(Color.GREEN)
            }
            else
            {
                result.text = "You're reproved. Mean: $mean Absence: $absence"
                result.setTextColor(Color.RED)
            }

        }

    }
}