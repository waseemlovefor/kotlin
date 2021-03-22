package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.waseem)
        button.setOnClickListener({
            Toast.makeText(this,"waseem haider",Toast.LENGTH_LONG).show()
        })
       val textview=findViewById<TextView>(R.id.textview)
        textview.setOnClickListener({
            textview.setText("waseem haider")
        })
    }
}