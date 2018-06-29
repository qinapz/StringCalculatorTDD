package stringCalculatorKataTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import stringCalculatorKata.Calculator;

public class TestCalculate {

    @Test
    public void anEmptyStringReturnsZero() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.calculate(""), 0);
    }
}
