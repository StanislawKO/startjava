package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public String calculate(String[] splitMathExpression) {
        firstNumber = Integer.parseInt(splitMathExpression[0]);
        secondNumber = Integer.parseInt(splitMathExpression[2]);
        sign = splitMathExpression[1].charAt(0);

        switch (sign) {
            case '+':
                return firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber);
            case '-':
                return firstNumber + " - " + secondNumber + " = " + Math.subtractExact(firstNumber, secondNumber);
            case '*':
                return firstNumber + " * " + secondNumber + " = " + Math.multiplyExact(firstNumber, secondNumber);
            case '/':
                return firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber);
            case '^':
                return firstNumber + " ^ " + secondNumber + " = " + (int) Math.pow(firstNumber, secondNumber);
            case '%':
                return firstNumber + " % " + secondNumber + " = " + (int) Math.IEEEremainder(firstNumber, secondNumber);
            default:
                 return "Указан неправильный знак математической операции.";
        }
    }
}