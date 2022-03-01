package com.example.sharewhatyoucanproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharewhatyoucanproject.R
import android.content.Intent
import com.example.sharewhatyoucanproject.HomescreenActivity
import com.example.sharewhatyoucanproject.MainActivity
import android.widget.EditText
import android.app.ProgressDialog
import android.view.View
import android.widget.Button
import com.example.sharewhatyoucanproject.DonorActivity
import com.example.sharewhatyoucanproject.DashboardActivity

class HomescreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)
        //donor action
        val button = findViewById<View>(R.id.button_first) as Button
        button.setOnClickListener { // Do something in response to button click
            startActivity(Intent(this@HomescreenActivity, DonorActivity::class.java))
        }

        //receiver action
        val button2 = findViewById<View>(R.id.button_second) as Button
        button2.setOnClickListener { // Do something in response to button click
            startActivity(Intent(this@HomescreenActivity, DashboardActivity::class.java))
        }
    }
}