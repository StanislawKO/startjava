package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            String mathematicalExpression = scanner.nextLine();
            String[] array = mathematicalExpression.split(" ");
            int firstNumber = Integer.parseInt(array[0]);
            calculator.setFirstNumber(firstNumber);
            int secondNumber = Integer.parseInt(array[2]);
            calculator.setSecondNumber(secondNumber);
            char sign = array[1].charAt(0);
            calculator.setSign(sign);

            calculator.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}
