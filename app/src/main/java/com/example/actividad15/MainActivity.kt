package com.example.actividad15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txt_grams : EditText
    private lateinit var txt_kilograms : EditText
    private lateinit var txt_minutes : EditText
    private lateinit var txt_seconds : EditText
    private lateinit var txt_meters : EditText
    private lateinit var txt_centimeters : EditText

    private lateinit var buttonGrams : Button
    private lateinit var buttonSeconds : Button
    private lateinit var buttonCentimeters : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_grams = findViewById(R.id.txt_grams)
        txt_kilograms = findViewById(R.id.txt_kilograms)
        txt_minutes = findViewById(R.id.txt_minutes)
        txt_seconds = findViewById(R.id.txt_seconds)
        txt_meters = findViewById(R.id.txt_meters)
        txt_centimeters = findViewById(R.id.txt_centimeters)

        buttonCentimeters = findViewById(R.id.buttonCentimeters)
        buttonSeconds = findViewById(R.id.buttonSeconds)
        buttonGrams = findViewById(R.id.buttonGrams)


        buttonGrams.setOnClickListener {
            var num = txt_grams.text

            if (num.toString().isEmpty()){
                Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
            }else{
                var grams = num.toString().toDouble()
                var kilograms = grams / 1000
                txt_kilograms.setText(kilograms.toString())
            }
        }

        buttonSeconds.setOnClickListener {
            var num = txt_minutes.text

            if (num.toString().isEmpty()){
                Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
            }else{
                var minutes = num.toString().toDouble()
                var seconds = minutes * 60
                txt_seconds.setText(seconds.toString())
            }
        }

        buttonCentimeters.setOnClickListener {
            var num = txt_meters.text

            if (num.toString().isEmpty()){
                Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
            }else{
                var meters = num.toString().toDouble()
                var centimeters = meters * 100
                txt_centimeters.setText(centimeters.toString())
            }
        }

    }
}