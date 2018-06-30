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
}
