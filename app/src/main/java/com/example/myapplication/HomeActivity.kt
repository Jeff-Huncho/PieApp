package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var tvname:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        tvname = findViewById(R.id.tvname)
        //receiving data sent from previous activity
        val username = intent.getStringExtra("username")
        tvname.text = username
        //comment here
    }
}