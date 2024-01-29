package com.example.ogarkov_23_01

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
class MainActivity : ComponentActivity() {
    private lateinit var tempreatureText: TextView
    private lateinit var preasureText: TextView
    private lateinit var windText: TextView
    private lateinit var feelsLikeText: TextView
    private lateinit var humidityText: TextView
    private lateinit var generateWheater: Button
    private lateinit var wetherIco: ImageView
    private lateinit var dateText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dateText = findViewById(R.id.dateText)
        tempreatureText = findViewById(R.id.tempreatureText)
        preasureText = findViewById(R.id.preasureText)
        windText = findViewById(R.id.windText)
        feelsLikeText = findViewById(R.id.feelsLikeText)
        humidityText = findViewById(R.id.HumidityText)
        generateWheater = findViewById(R.id.showWheather)
        wetherIco = findViewById(R.id.WheatherIco)

        generateWhether()
        generateWheater.setOnClickListener { view: View ->
            generateWhether()
        }

    }

    private fun generateWhether() {
        var month: Int = (1..12).random()
        println(month)
        when (month) {
            12 -> {
                wetherIco.setImageResource(R.drawable.winter)
                setParameters(-10, -3)
            }

            1 -> {
                wetherIco.setImageResource(R.drawable.winter)
                setParameters(-30, -16)
            }

            2 -> {
                wetherIco.setImageResource(R.drawable.winter)
                setParameters(-10, 0)
            }

            3 -> {
                wetherIco.setImageResource(R.drawable.vesna)
                setParameters(0, 2)
            }

            4 -> {
                wetherIco.setImageResource(R.drawable.vesna)
                setParameters(3, 10)
            }

            5 -> {
                wetherIco.setImageResource(R.drawable.vesna)

                setParameters(10, 18)
            }

            6 -> {
                wetherIco.setImageResource(R.drawable.summer)
                setParameters(15, 20)
            }

            7 -> {
                wetherIco.setImageResource(R.drawable.summer)
                setParameters(20, 35)
            }

            8 -> {
                wetherIco.setImageResource(R.drawable.summer)
                setParameters(20, 35)
            }

            9 -> {
                wetherIco.setImageResource(R.drawable.fall)
                setParameters(10, 20)
            }

            10 -> {
                wetherIco.setImageResource(R.drawable.fall)
                setParameters(8, 13)
            }

            11 -> {
                wetherIco.setImageResource(R.drawable.fall)
                setParameters(0, 10)
            }
        }
        dateText.setText("${(1..30).random()}/$month")

    }

    fun setTempreature(min: Int, max: Int) {
        var temp: Int = (min..max).random()
        tempreatureText.setText("$temp°/$max°")
    }

    fun setPreasure() {
        var preasure: Int = (700..1400).random()
        preasureText.setText("Давление: $preasure")
    }

    fun setWind() {
        var wind: Int = (1..20).random()
        windText.setText("Скорость ветра: $wind m/s")
    }

    fun setFeelsLike(min: Int, max: Int) {
        feelsLikeText.setText("Ощущается ${min + (1..5).random()}")
    }

    fun setHumidity() {
        var humidty: Int = (20..100).random()
        humidityText.setText("Влажность: $humidty %")
    }

    fun setParameters(min: Int, max: Int) {
        setTempreature(min, max)
        setPreasure()
        setFeelsLike(min, max)
        setWind()
        setHumidity()
    }
    }




