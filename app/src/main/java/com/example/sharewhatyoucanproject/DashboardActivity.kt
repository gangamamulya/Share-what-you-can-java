package com.example.sharewhatyoucanproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharewhatyoucanproject.R
import android.content.Intent
import com.example.sharewhatyoucanproject.HomescreenActivity
import com.example.sharewhatyoucanproject.MainActivity
import android.widget.EditText
import android.app.ProgressDialog
import com.example.sharewhatyoucanproject.DonorActivity
import com.example.sharewhatyoucanproject.DashboardActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }
}