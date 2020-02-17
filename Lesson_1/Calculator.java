public class Calculator {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 3;
        char simbol = '+';

        if (simbol == '+') {
            System.out.println("20 + 3 = " + (number1 + number2));
        } else if (simbol == '-') {
            System.out.println("20 - 3 = " + (number1 - number2));
        } else if (simbol == '*') {
            System.out.println("20 * 3 = " + (number1 * number2));
        } else if (simbol == '/') {
            System.out.println("20 / 3 = " + (number1 / number2));
        } else if (simbol == '^') {
            long result = number1;
            for (int i = 0; i < number2 - 1; i++) {
                result *= number1;
            }
            System.out.println("20 ^ 3 = " + result);
        } else if (simbol == '%') {
            System.out.println("20 % 3 = " + (number1 % number2));
        }
    }
}

