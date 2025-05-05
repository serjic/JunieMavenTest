package ogr.junie

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested

/**
 * Test class for Calculator
 */
class CalculatorTest {
    
    private val calculator = Calculator()
    
    @Nested
    @DisplayName("Addition tests")
    inner class AdditionTests {
        @Test
        @DisplayName("Adding two positive numbers")
        fun testAddPositiveNumbers() {
            assertEquals(5.0, calculator.add(2.0, 3.0), "2.0 + 3.0 should equal 5.0")
        }
        
        @Test
        @DisplayName("Adding a positive and a negative number")
        fun testAddPositiveAndNegative() {
            assertEquals(-1.0, calculator.add(2.0, -3.0), "2.0 + (-3.0) should equal -1.0")
        }
        
        @Test
        @DisplayName("Adding two negative numbers")
        fun testAddNegativeNumbers() {
            assertEquals(-5.0, calculator.add(-2.0, -3.0), "(-2.0) + (-3.0) should equal -5.0")
        }
        
        @Test
        @DisplayName("Adding zero")
        fun testAddZero() {
            assertEquals(2.0, calculator.add(2.0, 0.0), "2.0 + 0.0 should equal 2.0")
        }
    }
    
    @Nested
    @DisplayName("Subtraction tests")
    inner class SubtractionTests {
        @Test
        @DisplayName("Subtracting two positive numbers")
        fun testSubtractPositiveNumbers() {
            assertEquals(-1.0, calculator.subtract(2.0, 3.0), "2.0 - 3.0 should equal -1.0")
        }
        
        @Test
        @DisplayName("Subtracting a negative number from a positive number")
        fun testSubtractNegativeFromPositive() {
            assertEquals(5.0, calculator.subtract(2.0, -3.0), "2.0 - (-3.0) should equal 5.0")
        }
        
        @Test
        @DisplayName("Subtracting a positive number from a negative number")
        fun testSubtractPositiveFromNegative() {
            assertEquals(-5.0, calculator.subtract(-2.0, 3.0), "(-2.0) - 3.0 should equal -5.0")
        }
        
        @Test
        @DisplayName("Subtracting zero")
        fun testSubtractZero() {
            assertEquals(2.0, calculator.subtract(2.0, 0.0), "2.0 - 0.0 should equal 2.0")
        }
    }
    
    @Nested
    @DisplayName("Multiplication tests")
    inner class MultiplicationTests {
        @Test
        @DisplayName("Multiplying two positive numbers")
        fun testMultiplyPositiveNumbers() {
            assertEquals(6.0, calculator.multiply(2.0, 3.0), "2.0 * 3.0 should equal 6.0")
        }
        
        @Test
        @DisplayName("Multiplying a positive and a negative number")
        fun testMultiplyPositiveAndNegative() {
            assertEquals(-6.0, calculator.multiply(2.0, -3.0), "2.0 * (-3.0) should equal -6.0")
        }
        
        @Test
        @DisplayName("Multiplying two negative numbers")
        fun testMultiplyNegativeNumbers() {
            assertEquals(6.0, calculator.multiply(-2.0, -3.0), "(-2.0) * (-3.0) should equal 6.0")
        }
        
        @Test
        @DisplayName("Multiplying by zero")
        fun testMultiplyByZero() {
            assertEquals(0.0, calculator.multiply(2.0, 0.0), "2.0 * 0.0 should equal 0.0")
        }
    }
    
    @Nested
    @DisplayName("Division tests")
    inner class DivisionTests {
        @Test
        @DisplayName("Dividing two positive numbers")
        fun testDividePositiveNumbers() {
            assertEquals(2.0, calculator.divide(6.0, 3.0), "6.0 / 3.0 should equal 2.0")
        }
        
        @Test
        @DisplayName("Dividing a positive by a negative number")
        fun testDividePositiveByNegative() {
            assertEquals(-2.0, calculator.divide(6.0, -3.0), "6.0 / (-3.0) should equal -2.0")
        }
        
        @Test
        @DisplayName("Dividing a negative by a positive number")
        fun testDivideNegativeByPositive() {
            assertEquals(-2.0, calculator.divide(-6.0, 3.0), "(-6.0) / 3.0 should equal -2.0")
        }
        
        @Test
        @DisplayName("Dividing two negative numbers")
        fun testDivideNegativeNumbers() {
            assertEquals(2.0, calculator.divide(-6.0, -3.0), "(-6.0) / (-3.0) should equal 2.0")
        }
        
        @Test
        @DisplayName("Division by zero throws exception")
        fun testDivideByZero() {
            val exception = assertThrows(IllegalArgumentException::class.java) {
                calculator.divide(2.0, 0.0)
            }
            assertEquals("Cannot divide by zero", exception.message)
        }
    }
}