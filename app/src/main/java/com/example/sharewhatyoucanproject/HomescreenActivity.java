package com.example.sharewhatyoucanproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class HomescreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        //donor action
        Button button = (Button) findViewById(R.id.button_first);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                // Do something in response to button click
                startActivity(new Intent(HomescreenActivity.this, DonorActivity.class));
            }
        });

        //receiver action
        Button button2 = (Button) findViewById(R.id.button_second);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                // Do something in response to button click
                startActivity(new Intent(HomescreenActivity.this, DashboardActivity.class));
            }
        });



    }
}