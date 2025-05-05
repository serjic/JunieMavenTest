package ogr.junie

/**
 * A simple calculator class that performs basic arithmetic operations.
 */
class Calculator {
    /**
     * Adds two numbers.
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    fun add(a: Double, b: Double): Double = a + b

    /**
     * Subtracts the second number from the first.
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    fun subtract(a: Double, b: Double): Double = a - b

    /**
     * Multiplies two numbers.
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    fun multiply(a: Double, b: Double): Double = a * b

    /**
     * Divides the first number by the second.
     * @param a First number
     * @param b Second number
     * @return Quotient of a and b
     * @throws IllegalArgumentException if b is zero
     */
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        return a / b
    }
}

/**
 * Main function that provides a command-line interface for the Calculator.
 */
fun main() {
    val calculator = Calculator()

    println("Welcome to the Calculator CLI!")
    println("Available operations: add, subtract, multiply, divide")
    println("Enter 'exit' to quit")

    while (true) {
        print("\nEnter operation (add/subtract/multiply/divide): ")
        val operation = readLine()?.trim()?.lowercase() ?: ""

        if (operation == "exit") {
            println("Goodbye!")
            break
        }

        if (operation !in listOf("add", "subtract", "multiply", "divide")) {
            println("Invalid operation. Please try again.")
            continue
        }

        try {
            print("Enter first number: ")
            val a = readLine()?.toDoubleOrNull()
            if (a == null) {
                println("Invalid number. Please try again.")
                continue
            }

            print("Enter second number: ")
            val b = readLine()?.toDoubleOrNull()
            if (b == null) {
                println("Invalid number. Please try again.")
                continue
            }

            val result = when (operation) {
                "add" -> calculator.add(a, b)
                "subtract" -> calculator.subtract(a, b)
                "multiply" -> calculator.multiply(a, b)
                "divide" -> calculator.divide(a, b)
                else -> throw IllegalStateException("Unexpected operation: $operation")
            }

            println("Result: $result")
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        } catch (e: Exception) {
            println("An unexpected error occurred: ${e.message}")
        }
    }
}
