package com.example.test_x1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val nameR = intent.getStringExtra("nameActivityMain")
        val ciudadR = intent.getStringExtra("city")

        val tResumen : TextView = findViewById(R.id.textView)

        tResumen.text = "Bienvenido, $nameR.\nTú eres de $ciudadR."
    }
}