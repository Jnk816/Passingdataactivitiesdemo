package com.example.passingdataactivitiesdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var name = intent.getStringExtra("personName")

        var tv = findViewById<TextView>(R.id.tvResult)
        tv.text = name
    }
}