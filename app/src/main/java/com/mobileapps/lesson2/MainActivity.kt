package com.mobileapps.lesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the existing "Get Started" button by its ID
        val getStartedButton = findViewById<Button>(R.id.getStartedButton)

        // Set an onClickListener to the button to navigate to AccountActivity
        getStartedButton.setOnClickListener {
            // Create an Intent to start AccountActivity
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }
    }
}
