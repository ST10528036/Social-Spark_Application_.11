package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.DialogTitle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declarations of variables
    private lateinit var tvTitle: TextView
    private lateinit var tvResult: TextView
    private lateinit var edtSparkOption: EditText
    private lateinit var btnCheckSpark: Button
    private lateinit var btnReset: Button
    private lateinit var btnOptions: Button
    private lateinit var tvOption: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Initializing values (TypeCasting)
        tvTitle = findViewById(R.id.tvResult)
        tvResult = findViewById(R.id.tvResult)
        edtSparkOption = findViewById(R.id.edtSparkOption)
        btnReset = findViewById(R.id.btnReset)
        btnOptions = findViewById(R.id.btnOptions)
        tvOption = findViewById(R.id.tvOptions)

        val morning = "Send a 'Good morning' text to a family member."
        val midmorning = "Reach out to a colleague with a quick 'Thank you'."
        val afternoon = "Share a funny meme or interesting link with a friend."
        val afternoonSnackTime = "Send a quick 'thinking of you' message."
        val dinner = "call a friend or relative for a 5-minute catch-up."
        val night = "Leave a thoughtful comment on a friend's post."

        btnCheckSpark.setOnClickListener {
            //If the user inputs anytime of the day it will show them the response
            if (edtSparkOption.text.toString().lowercase() == "Morning") {
                tvResult.text = morning
            } else if (edtSparkOption.text.toString().lowercase() == "Midmorning")
                tvResult.text = midmorning
            else if (edtSparkOption.text.toString().lowercase() == "Afternoon")
                tvResult.text = afternoon
            else if (edtSparkOption.text.toString().lowercase() == "Afternoon snack time")
                tvResult.text = afternoonSnackTime
            else if (edtSparkOption.text.toString().lowercase() == "Dinner")
                tvResult.text = dinner
            else if (edtSparkOption.text.toString().lowercase() == "Night")
                edtSparkOption.text.toString().lowercase() == "After dinner"
            tvResult.text = night
        }
        //This is an error check
        else{
            tvResult.text = "Invalid input"
        }

        btnReset.setOnClickListener {
            tvResult.text = " "
            //Adding " " clears screen output
        }
        btnOptions.setOnClickListener {
            tvResult.text =
                "Options for time of day: morning, mid-morning, afternoon, afternoon snack time, dinner, night."
        }
    }
}