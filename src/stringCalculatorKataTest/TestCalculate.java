package stringCalculatorKataTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import stringCalculatorKata.Calculator;

public class TestCalculate {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void anEmptyStringReturnsZero() {
        assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void aSingleNumberReturnsTheInsertedNumber() {
        assertEquals(calculator.calculate("1"), 1);
    }

    @Test
    public void twoNumbersReturnsTheSum() {
        assertEquals(calculator.calculate("1,2"), 3);
    }
}
