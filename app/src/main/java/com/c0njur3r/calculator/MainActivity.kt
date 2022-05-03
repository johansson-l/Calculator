package com.c0njur3r.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        // Operator button references
        val equal: Button = findViewById(R.id.btn_equals)
        val plus: Button = findViewById(R.id.btn_plus)
        val minus: Button = findViewById(R.id.btn_minus)
        val divide: Button = findViewById(R.id.btn_divide)
        val multiply: Button = findViewById(R.id.btn_multiply)
        val comma: Button = findViewById(R.id.btn_comma)
        val remainder: Button = findViewById(R.id.btn_remainder)

        // Others
        val erase: Button = findViewById(R.id.btn_erase)

        // TextView references
        val textViewCurrentNumber: TextView = findViewById(R.id.number_current)
        val textViewHistoryText: TextView = findViewById(R.id.number_history)

        // Number input references
        val ZERO: String = "0"
        val ONE: String = "1"
        val TWO: String = "2"
        val THREE: String = "3"
        val FOUR: String = "4"
        val FIVE: String = "5"
        val SIX: String = "6"
        val SEVEN: String = "7"
        val EIGHT: String = "8"
        val NINE: String = "9"

        // Operator input references
        val PLUS: String = " + "
        val MINUS: String = " - "
        val DIVIDE: String = " / "
        val MULTIPLY: String = " * "
        val COMMA: String = "."
        val REMAINDER: String = " % "
        val EQUAL: String = " = "

        fun onButtonClick(input: String) {
            if (input == EQUAL) {
                val result = evaluate(textViewCurrentNumber.text.toString())
                textViewHistoryText.text = textViewCurrentNumber.text
                textViewHistoryText.append(input)
                textViewCurrentNumber.text = result

            } else {
                textViewCurrentNumber.append(input)
            }
        }

        zero.setOnClickListener { onButtonClick(ZERO) }
        one.setOnClickListener { onButtonClick(ONE) }
        two.setOnClickListener { onButtonClick(TWO) }
        three.setOnClickListener { onButtonClick(THREE) }
        four.setOnClickListener { onButtonClick(FOUR) }
        five.setOnClickListener { onButtonClick(FIVE) }
        six.setOnClickListener { onButtonClick(SIX) }
        seven.setOnClickListener { onButtonClick(SEVEN) }
        eight.setOnClickListener { onButtonClick(EIGHT) }
        nine.setOnClickListener { onButtonClick(NINE) }

        // Operator listener
        plus.setOnClickListener { onButtonClick(PLUS) }
        minus.setOnClickListener { onButtonClick(MINUS) }
        divide.setOnClickListener { onButtonClick(DIVIDE) }
        multiply.setOnClickListener { onButtonClick(MULTIPLY) }
        comma.setOnClickListener { onButtonClick(COMMA) }
        remainder.setOnClickListener { onButtonClick(REMAINDER) }
        equal.setOnClickListener { onButtonClick(EQUAL) }

        // Others
        erase.setOnClickListener {
            textViewCurrentNumber.text = ""
            textViewHistoryText.text = ""
        }

    }
}