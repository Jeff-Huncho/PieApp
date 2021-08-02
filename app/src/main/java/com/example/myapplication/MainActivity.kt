package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {
    //declaring views
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var btnsignin: ExtendedFloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.etusername)
        password = findViewById(R.id.etpassword)
        btnsignin = findViewById(R.id.btnsignin)
        btnsignin.setOnClickListener{
            //grabbing text from edit texts
            val username = username.text.toString().trim()
            val password = password.text.toString().trim()
//            Toast.makeText(this, "username: $username\npassword: $password",
//                Toast.LENGTH_LONG).show()

            val homeActivity = Intent(Intent(this, HomeActivity::class.java))
            homeActivity.putExtra("username", username)
            (startActivity(homeActivity))

        }
    }
}