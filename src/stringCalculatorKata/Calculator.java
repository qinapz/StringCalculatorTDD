package stringCalculatorKata;

public class Calculator {

    public int calculate(String input) {
        String[] numbers = input.split(",");
        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1) {
            return stringToInt(input);
        } else {
            return stringToInt(numbers[0]) + stringToInt(numbers[1]);
        }
    }

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

}
