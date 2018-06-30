package stringCalculatorKata;

public class Calculator {

    private static final String SEPARATOR = ",";

    public int calculate(String input) {
        String[] numbers = input.split(SEPARATOR);
        if (isEmpty(input)) {
            return 0;
        }
        if (isSingleNumber(input)) {
            return stringToInt(input);
        } else {
            return sum(numbers);
        }
    }

    private int sum(String[] numbers) {
        return stringToInt(numbers[0]) + stringToInt(numbers[1]);
    }

    private boolean isSingleNumber(String input) {
        return input.length() == 1;
    }

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

}
