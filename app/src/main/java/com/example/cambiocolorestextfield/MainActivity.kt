package com.example.cambiocolorestextfield

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.cambiocolorestextfield.R.id
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var layout: ConstraintLayout
    private lateinit var epilepsia: TextView
    private lateinit var contadorClicks: TextView
    private val colores = listOf(
        R.color.rojo,
        R.color.azul,
        R.color.verde,
        R.color.amarillo,
        R.color.blanco,
        R.color.negro
    )
    private var colorIndex = 0
    private var contClicks = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        epilepsia = findViewById(id.epilepsia)
        contadorClicks = findViewById(id.contadorClicks)
        layout = findViewById(id.main)

        epilepsia.setOnClickListener {
            val colorRandom = colores[Random.nextInt(0, colores.size)]
            layout.setBackgroundColor(resources.getColor(colorRandom, null))
            if (colorRandom == R.color.blanco ||colorRandom == R.color.amarillo) {
                epilepsia.setTextColor(getColor(colores[5]))
                contadorClicks.setTextColor(getColor(colores[5]))
            } else {
                epilepsia.setTextColor(getColor(colores[4]))
                contadorClicks.setTextColor(getColor(colores[4]))
            }
            colorIndex = Random.nextInt(0, colores.size)
            contClicks++
            contadorClicks.text = contClicks.toString()
        }


    }
}