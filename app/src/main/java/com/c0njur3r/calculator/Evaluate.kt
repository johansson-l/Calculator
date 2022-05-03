package com.c0njur3r.calculator

fun evaluate(expression: String): String {
    val valueOne = expression.takeWhile { it != ' ' }.toDouble()
    val valueTwo = expression.takeLastWhile { it != ' ' }.toDouble()
    var sum = 0.0

    for (char in expression) {
        when (char) {
            '+' -> sum = valueOne.plus(valueTwo)
            '-' -> sum = valueOne.minus(valueTwo)
            '*' -> sum = valueOne.times(valueTwo)
            '/' -> sum = valueOne.div(valueTwo)
            '%' -> sum = valueOne.mod(valueTwo)
        }
    }
    return sum.toString()
}