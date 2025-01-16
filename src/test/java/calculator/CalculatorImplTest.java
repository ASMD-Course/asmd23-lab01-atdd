package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorImplTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test
    @DisplayName("Calculator should add two positive numbers")
    void shouldAddTwoNumbers() {
        calculator.enter(5);
        calculator.enter(3);
        calculator.add();
        assertEquals(8, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should add a negative and a positive number")
    void shouldHandleNegativeNumbers() {
        calculator.enter(-5);
        calculator.enter(3);
        calculator.add();
        assertEquals(-2, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should throw an exception when entering more than two numbers")
    void shouldThrowExceptionWhenEnteringMoreThanTwoNumbers() {
        calculator.enter(1);
        calculator.enter(2);
        assertThrows(IllegalStateException.class, () -> calculator.enter(3));
    }

    @Test
    @DisplayName("Calculator should throw an exception when entering less than two numbers")
    void shouldThrowExceptionWhenAddingWithLessThanTwoNumbers() {
        calculator.enter(1);
        assertThrows(IllegalStateException.class, () -> calculator.add());
    }

    @Test
    @DisplayName("Calculator should throw an exception when no numbers are inserted")
    void shouldThrowExceptionWhenAddingWithNoNumbers() {
        assertThrows(IllegalStateException.class, () -> calculator.add());
    }

    @Test
    @DisplayName("Calculator should throw an exception when I'm getting a result without calculating anything")
    void shouldThrowExceptionWhenGettingResultWithNoNumbers() {
        assertThrows(IllegalStateException.class, () -> calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should throw an exception when no operation is performed")
    void shouldThrowExceptionWhenGettingResultWithTwoNumbers() {
        calculator.enter(1);
        calculator.enter(2);
        assertThrows(IllegalStateException.class, () -> calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should handle minimum values when adding")
    void shouldHandleZeroes() {
        calculator.enter(0);
        calculator.enter(0);
        calculator.add();
        assertEquals(0, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should handle maximum values when adding")
    void shouldHandleMaxIntegerValues() {
        calculator.enter(Integer.MAX_VALUE);
        calculator.enter(0);
        calculator.add();
        assertEquals(Integer.MAX_VALUE, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should subtract two numbers")
    void shouldSubtractTwoNumbers() {
        calculator.enter(5);
        calculator.enter(3);
        calculator.subtract();
        assertEquals(2, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should subtract a negative and a positive number")
    void shouldHandleNegativeNumbersInSubtraction() {
        calculator.enter(-5);
        calculator.enter(3);
        calculator.subtract();
        assertEquals(-8, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should subtract zeros")
    void shouldHandleZeroesInSubtraction() {
        calculator.enter(0);
        calculator.enter(0);
        calculator.subtract();
        assertEquals(0, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should multiply two positive numbers")
    void shouldMultiplyTwoPositiveNumbers() {
        calculator.enter(4);
        calculator.enter(3);
        calculator.multiply();
        assertEquals(12, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should multiply a number by zero")
    void shouldMultiplyWithZero() {
        calculator.enter(5);
        calculator.enter(0);
        calculator.multiply();
        assertEquals(0, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should multiply two negative numbers")
    void shouldMultiplyNegativeNumbers() {
        calculator.enter(-3);
        calculator.enter(-2);
        calculator.multiply();
        assertEquals(6, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should multiply a negative and a positive number")
    void shouldMultiplyPositiveAndNegativeNumbers() {
        calculator.enter(-3);
        calculator.enter(4);
        calculator.multiply();
        assertEquals(-12, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should throw an exception when multiplying with one number")
    void shouldThrowExceptionWhenMultiplyingWithOneNumber() {
        calculator.enter(5);
        assertThrows(IllegalStateException.class, () -> calculator.multiply());
    }

    @Test
    @DisplayName("Calculator should throw an exception when multiplying without numbers")
    void shouldThrowExceptionWhenMultiplyingWithNoNumbers() {
        assertThrows(IllegalStateException.class, () -> calculator.multiply());
    }

    @Test
    @DisplayName("Calculator should handle minimum integer value multiplication")
    void shouldHandleMultiplicationWithMinValues() {
        calculator.enter(Integer.MIN_VALUE);
        calculator.enter(1);
        calculator.multiply();
        assertEquals(Integer.MIN_VALUE, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should handle maximum integer value multiplication")
    void shouldHandleMultiplicationWithMaxValues() {
        calculator.enter(Integer.MAX_VALUE);
        calculator.enter(1);
        calculator.multiply();
        assertEquals(Integer.MAX_VALUE, calculator.getResult());
    }

    @Test
    @DisplayName("Calculator should throw an exception when number less than two are inserted")
    void shouldThrowExceptionWhenSubtractingWithLessThanTwoNumbers() {
        calculator.enter(1);
        assertThrows(IllegalStateException.class, () -> calculator.subtract());
    }

    @Test
    @DisplayName("Calculator should throw an exception when you perform a subtraction without a number")
    void shouldThrowExceptionWhenSubtractingWithNoNumbers() {
        assertThrows(IllegalStateException.class, () -> calculator.subtract());
    }
}