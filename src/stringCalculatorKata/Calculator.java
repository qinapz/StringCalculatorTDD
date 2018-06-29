package stringCalculatorKata;

public class Calculator {

    private static final String separator = ",|\n";

    public int calculate(String input) {
        String[] numbers = input.split(separator);
        return Sum(input, numbers);
    }

    private int Sum(String input, String[] numbers) {
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
        isNegative(numbers);
        int sum = 0;
        sum = getSum(numbers, sum);
        return sum;
    }

    private int getSum(String[] numbers, int sum) {
        for (String number : numbers) {
            if (stringToInt(number) > 1000) {
                continue;
            }
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    private void isNegative(String[] numbers) {
        for (String current : numbers) {
            if (stringToInt(current) < 0) {
                throw new IllegalArgumentException("NEGATIVE INPUT");
            }
        }
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
