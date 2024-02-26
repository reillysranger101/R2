package com.example.test_x1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnviar : Button = findViewById<Button>(R.id.btn_comenzar)
        val txtName : EditText = findViewById<EditText>(R.id.txt_name)

        btnEnviar.setOnClickListener (){
            val name = txtName.text.toString()
            val intent = Intent(this,Activity3::class.java).apply{
                putExtra("name", name)
            }
            startActivity(intent)
            //funcionando
        }

    }


}