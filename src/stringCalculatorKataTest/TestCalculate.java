package stringCalculatorKataTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import stringCalculatorKata.Calculator;

public class TestCalculate {

    private Calculator calculator;

    @Before
    public void init() {
        Calculator calculator = new Calculator();
    }

    @Test
    public void anEmptyStringReturnsZero() {
        assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void aSingleNumberReturnsTheInsertedNumber() {
        assertEquals("1", 1);
    }
}
