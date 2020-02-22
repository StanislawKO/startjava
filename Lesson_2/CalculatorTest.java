import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        while (true) {
            Calculator calculator = new Calculator();
            System.out.print("Введите первое число: ");
            Scanner scanFirstNumber = new Scanner(System.in);
            int firstNumber = scanFirstNumber.nextInt();
            calculator.setFirstNumber(firstNumber);
            System.out.print("Введите знак математической операции: ");
            Scanner scanSign = new Scanner(System.in);
            char sign = scanSign.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            Scanner scanSecondNumber = new Scanner(System.in);
            int secondNumber = scanSecondNumber.nextInt();
            calculator.setSecondNumber(secondNumber);

            calculator.calc(sign);

            System.out.print("Хотите продолжить? [да/нет]: ");
            Scanner scanAnswer = new Scanner(System.in);
            String answer = scanAnswer.nextLine();

            if (answer.equals("нет")) {
                break;
            }
        }
    }
}
