public class Calculator {
    public static void main(String[] args) {
        long number1= 20;
        int number2 = 3;
        char plus = '+';
        char minus = '-';
        char multiplication = '*';
        char division = '/';
        char exponentation = '^';
        char remainerOfDivision = '%';
        char simbol = '+';

        if (simbol == plus) {
            System.out.println("20 + 3 = " + (number1 + number2));
        } else if (simbol == minus) {
            System.out.println("20 - 3 = " + (number1 - number2));
        } else if (simbol == multiplication) {
            System.out.println("20 * 3 = " + (number1 * number2));
        } else if (simbol == division) {
            System.out.println("20 / 3 = " + (number1 / number2));
        } else if (simbol == exponentation) {
            long result = number1;
            for (int i = 0; i < number2 - 1; i++) {
                result *= number1;
            }
            System.out.println("20 ^ 3 = " + result);
        } else if (simbol == remainerOfDivision) {
            System.out.println("20 % 3 = " + (number1 % number2));
        }

    }
}

