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
            return sumOfTheNumbers(numbers);
        }
    }

    private int sumOfTheNumbers(String[] numbers) {
        for (String current : numbers) {
            if (stringToInt(current) < 0) {
                throw new IllegalArgumentException("NEGATIVE INPUT");
            }
        }
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
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
