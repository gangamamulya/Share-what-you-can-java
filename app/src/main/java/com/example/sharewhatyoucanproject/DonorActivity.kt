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
import android.widget.ImageView
import com.example.sharewhatyoucanproject.DonorActivity
import com.example.sharewhatyoucanproject.DashboardActivity
import java.util.ArrayList

class DonorActivity : AppCompatActivity() {
    private val permissionsToRequest: ArrayList<*>? = null
    private val permissionsRejected: ArrayList<*> = ArrayList<Any?>()
    private val permissions: ArrayList<*> = ArrayList<Any?>()

    // Creating button.
    var ChooseButton: Button? = null
    var UploadButton: Button? = null
    var LocationButton: Button? = null

    // Creating EditText.
    var ImageName: EditText? = null
    var ImageDescription: EditText? = null

    // Creating ImageView.
    var SelectImage: ImageView? = null

    // Image request code for onActivityResult() .
    var Image_Request_Code = 7
    var progressDialog: ProgressDialog? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donor)


        //Assign ID'S to button.
        ChooseButton = findViewById<View>(R.id.btnChoose) as Button
        UploadButton = findViewById<View>(R.id.btnUpload) as Button
        LocationButton = findViewById<View>(R.id.btn) as Button

        // Assign ID's to EditText.
        ImageName = findViewById<View>(R.id.foodname) as EditText
        ImageDescription = findViewById<View>(R.id.fooddesc) as EditText

        // Assign ID'S to image view.
        SelectImage = findViewById<View>(R.id.imageView) as ImageView


        // Adding click listener to Choose image button.
        ChooseButton!!.setOnClickListener { // Creating intent.
            val intent = Intent()

            // Setting intent type as image to select image from phone storage.
            intent.type = "image/*"
            intent.action = Intent.ACTION_GET_CONTENT
            startActivityForResult(
                Intent.createChooser(intent, "Please Select Image"),
                Image_Request_Code
            )
        }


        // Adding click listener to Upload image button.
        UploadButton!!.setOnClickListener {


        }
    }

    companion object {
        private const val ALL_PERMISSIONS_RESULT = 101
    }
}