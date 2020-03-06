package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            String srcMathExpression = scanner.nextLine();
            String[] splitMathExpression = srcMathExpression.split(" ");
            calculator.calculate(splitMathExpression);

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}
