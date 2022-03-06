package com.c0njur3r.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize an empty list to hold the input values
        var numberList = mutableListOf<Any>()

        // Button references
        val one: Button = findViewById(R.id.btn_one)
        val two: Button = findViewById(R.id.btn_two)
        val three: Button = findViewById(R.id.btn_three)
        val four: Button = findViewById(R.id.btn_four)
        val five: Button = findViewById(R.id.btn_five)
        val six: Button = findViewById(R.id.btn_six)
        val seven: Button = findViewById(R.id.btn_seven)
        val eight: Button = findViewById(R.id.btn_eight)
        val nine: Button = findViewById(R.id.btn_nine)
        val zero: Button = findViewById(R.id.btn_zero)
        val equal: Button = findViewById(R.id.btn_equals)
        val plus: Button = findViewById(R.id.btn_plus)
        val minus: Button = findViewById(R.id.btn_minus)
        val divide: Button = findViewById(R.id.btn_divide)
        val multiply: Button = findViewById(R.id.btn_multiply)
        val parentheses: Button = findViewById(R.id.btn_parentheses)
        val erase: Button = findViewById(R.id.btn_erase)
        val remainder: Button = findViewById(R.id.btn_remainder)
        val invert: Button = findViewById(R.id.btn_invert)
        val point: Button = findViewById(R.id.btn_point)

        // TextView reference
        val resultView: TextView = findViewById(R.id.result_view)

        // TextView is appended with the button number when clicked
        one.setOnClickListener { resultView.append(one.text) }
        two.setOnClickListener { resultView.append(two.text) }
        three.setOnClickListener { resultView.append(three.text) }
        four.setOnClickListener { resultView.append(four.text) }
        five.setOnClickListener { resultView.append(five.text) }
        six.setOnClickListener { resultView.append(six.text) }
        seven.setOnClickListener { resultView.append(seven.text) }
        eight.setOnClickListener { resultView.append(eight.text) }
        nine.setOnClickListener { resultView.append(nine.text) }
        zero.setOnClickListener { resultView.append(zero.text) }

        // TextView is cleared when erase button is pressed
        erase.setOnClickListener { resultView.text = "" }

        // Stores the current numbers to list and adding + as an own index
        plus.setOnClickListener {
            // Add the current value to list
            numberList.add(resultView.text)
            // Adds + in next index
            numberList.add("+")
            // Clear the TextView
            resultView.text =""
        }

        // Stores the current numbers to list and calculates the inputs in the list
        equal.setOnClickListener { numberList.add(resultView.text) }
        TODO("Calculate the indexes in the list")
        for (x in numberList.indices)
    }
}