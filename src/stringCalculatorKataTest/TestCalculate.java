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
    public void emptyStringReturnsZero() {
        assertEquals(0, calculator.calculate(""));
    }

    @Test
    public void givenOneNumberCalculatorReturnsThatNumber() {
        assertEquals(1, calculator.calculate("1"));
    }

    @Test
    public void givenTwoNumbersSeparatedByCommaCalculatorReturnsTheSum() {
        assertEquals(4, calculator.calculate("2,2"));
    }

    @Test
    public void givenTwoNumbersSeparatedByNewLineCalculatorReturnsTheSum() {
        assertEquals(4, calculator.calculate("2\n2"));
    }

    @Test
    public void givenThreeNumbersSeparatedEitherWayCalculatorReturnsTheSum() {
        assertEquals(4, calculator.calculate("2,1\n1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNegativeNumberCalculatorThrowsException() {
        calculator.calculate("-1");
    }
}
