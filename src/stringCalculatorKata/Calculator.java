package stringCalculatorKata;

public class Calculator {

    private static final String SEPARATOR = ",|\n";

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
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += stringToInt(numbers[i]);
        }
        return sum;
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
