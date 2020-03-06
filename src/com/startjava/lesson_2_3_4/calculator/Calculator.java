package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void calculate(String[] splitMathExpression) {
        firstNumber = Integer.parseInt(splitMathExpression[0]);
        secondNumber = Integer.parseInt(splitMathExpression[2]);
        sign = splitMathExpression[1].charAt(0);

        switch (sign) {
            case '+':
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println(firstNumber + " * " + secondNumber + " = " + Math.multiplyExact(firstNumber, secondNumber));
                break;
            case '/':
                System.out.println(firstNumber + " / " + secondNumber + " = " + Math.subtractExact(firstNumber, secondNumber));
                break;
            case '^':
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + (int) Math.pow(firstNumber, secondNumber));
                break;
            case '%':
                System.out.println(firstNumber + " % " + secondNumber + " = " + (int) Math.IEEEremainder(firstNumber, secondNumber));
                break;
        }
    }
}