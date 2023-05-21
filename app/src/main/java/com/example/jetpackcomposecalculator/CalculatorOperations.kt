package com.example.jetpackcomposecalculator

sealed class CalculatorOperations(val operation: String) {
    object Add: CalculatorOperations("+")
    object Subtract: CalculatorOperations("-")
    object Multiply: CalculatorOperations("*")
    object Divide: CalculatorOperations("/")
}
