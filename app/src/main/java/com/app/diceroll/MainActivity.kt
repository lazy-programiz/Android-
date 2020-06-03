package com.app.diceroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.result_text)
        val rollButton: Button = findViewById(R.id.roll_btn)
        val countUpButton: Button = findViewById(R.id.countUp_btn)
        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener{countUp()}

    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            var resultInt = resultText.text.toString().toInt()
            if(resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()

            }
        }

    }
}