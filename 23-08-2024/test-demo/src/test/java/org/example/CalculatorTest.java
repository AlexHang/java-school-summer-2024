package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator testCalculator;

    @Before
    public void setUp() throws Exception {
        testCalculator =  new Calculator();
    }

    @Test
    public void testAdd() {
        int x = 5;
        int y = 2;
        assertEquals(7, testCalculator.add(x, y));
    }

    @Test
    public void testSubstract() {
        int x = 5;
        int y = 2;
        assertEquals(3, testCalculator.substract(x, y));
    }

    @Test
    public void testMultiply() {
        int x = 5;
        int y = 2;
        assertEquals(10, testCalculator.multiply(x, y));
    }

    @Test
    public void testDivide() {
        int x = 5;
        int y = 2;
        assertEquals(2.5, testCalculator.divide(x, y), 0.1);
    }
    @Test
    public void testDivideByZero(){
        int x = 5;
        int y = 0;
        assertThrows(ArithmeticException.class, () ->
                testCalculator.divide(x,y)
        );
    }
}