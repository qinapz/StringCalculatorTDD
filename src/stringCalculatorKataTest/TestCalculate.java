package stringCalculatorKataTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import stringCalculatorKata.Calculator;

public class TestCalculate {

    @Test
    public void emptyStringReturnsZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.calculate(""));
    }

}
