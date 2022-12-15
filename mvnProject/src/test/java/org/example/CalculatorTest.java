package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoValues1and1() {
        int sum = Calculator.sum(1, 1);
        Assertions.assertEquals(2, sum);
    }

    @Test
    void shouldSubtractOneValuesFromTheOther2and1() {
        int diff = Calculator.subtract(2, 1);
        Assertions.assertEquals(1, diff);
    }

    @Test
    void shouldMultiplyTwoValues2and3() {
        int product = Calculator.multiply(2, 3);
        Assertions.assertEquals(6, product);
    }

    @Test
    void shouldDivideOneValueByTheOther10and2() {
        int quotient = Calculator.divide(10, 2);
        Assertions.assertEquals(5, quotient);
    }
}