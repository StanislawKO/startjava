import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer = "да";
        while (answer.equals("да")) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            calculator.setFirstNumber(firstNumber);
            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            calculator.setSign(sign);
            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            calculator.setSecondNumber(secondNumber);

            calculator.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}
