package com.example.test_x1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val btnSend : Button = findViewById<Button>(R.id.btn_start)
        val txtCity : EditText = findViewById<EditText>(R.id.txt_city)

        val nameActivityMain = intent.getStringExtra("name")

        btnSend.setOnClickListener (){
            val city = txtCity.text.toString()
            val intent = Intent(this,Activity2::class.java).apply{
                putExtra("nameActivityMain", nameActivityMain)
                putExtra("city", city)
            }
            startActivity(intent)
            //funcionando
        }

    }


}