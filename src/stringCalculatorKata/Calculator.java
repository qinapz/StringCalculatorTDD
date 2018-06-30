package stringCalculatorKata;

public class Calculator {

    private static final String SEPARATOR = ",|\n";
    private int sum;

    public int calculate(String input) {
        String[] numbers = input.split(SEPARATOR);
        if (isEmpty(input)) {
            return 0;
        } else if (isSingleNumber(input)) {
            return stringToInt(input);
        } else {
            return sum(numbers);
        }
    }

    private int sum(String[] numbers) {
        sum = 0;
        for (String number : numbers) {
            if (stringToInt(number) < 0) {
                throw new IllegalArgumentException();
            }
            sum += stringToInt(number);
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
