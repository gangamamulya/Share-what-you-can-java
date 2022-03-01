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

class ImageUploadInfo {
    var imageName: String? = null
    var imageURL: String? = null
    var imageDescription: String? = null
    constructor() {}
    constructor(name: String?, url: String?, descr: String?) {
        imageName = name
        imageURL = url
        imageDescription = descr

    }
}