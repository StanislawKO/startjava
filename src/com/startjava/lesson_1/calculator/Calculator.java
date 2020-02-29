package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 3;
        char sigh = '+';

        if (sigh == '+') {
            System.out.println("20 + 3 = " + (number1 + number2));
        } else if (sigh == '-') {
            System.out.println("20 - 3 = " + (number1 - number2));
        } else if (sigh == '*') {
            System.out.println("20 * 3 = " + (number1 * number2));
        } else if (sigh == '/') {
            System.out.println("20 / 3 = " + (number1 / number2));
        } else if (sigh == '^') {
            long result = number1;
            for (int i = 0; i < number2 - 1; i++) {
                result *= number1;
            }
            System.out.println("20 ^ 3 = " + result);
        } else if (sigh == '%') {
            System.out.println("20 % 3 = " + (number1 % number2));
        }
    }
}

