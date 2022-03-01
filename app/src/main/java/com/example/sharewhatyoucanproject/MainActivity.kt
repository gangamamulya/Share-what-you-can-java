package com.example.sharewhatyoucanproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharewhatyoucanproject.R
import android.content.Intent
import com.example.sharewhatyoucanproject.HomescreenActivity
import com.example.sharewhatyoucanproject.MainActivity
import android.widget.EditText
import android.app.ProgressDialog
import android.widget.Button
import com.example.sharewhatyoucanproject.DonorActivity
import com.example.sharewhatyoucanproject.DashboardActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.nextButton)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, HomescreenActivity::class.java)
            startActivity(intent)
        }
    }
    companion object {
        val value: String? = null
    }
}