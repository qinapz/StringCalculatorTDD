package stringCalculatorKata;

public class Calculator {

    private static final String separator = ",|\n";

    public int calculate(String input) {
        String[] numbers = input.split(separator);
        if (isEmpty(input)) {
            return 0;
        }
        if (isSingleNumber(input)) {
            return stringToInt(input);
        } else {
            return sumOfTwoNumbers(numbers);
        }
    }

    private int sumOfTwoNumbers(String[] numbers) {
        return stringToInt(numbers[0]) + stringToInt(numbers[1]);
    }

    private boolean isSingleNumber(String input) {
        return input.length() == 1;
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }

}
