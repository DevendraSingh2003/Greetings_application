package com.example.greetingsapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edt :EditText = findViewById(R.id.edt)
        val btn : Button = findViewById(R.id.btn)

        btn.setOnClickListener {

            var enteredText = edt.text
            Toast.makeText(this,"HELLO "+enteredText,Toast.LENGTH_LONG).show()



        }


    }
}