package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public String calculate(String[] splitMathExpression) {
        firstNumber = Integer.parseInt(splitMathExpression[0]);
        secondNumber = Integer.parseInt(splitMathExpression[2]);
        sign = splitMathExpression[1].charAt(0);
        String str = "";

        switch (sign) {
            case '+':
                str = firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber);
                break;
            case '-':
                str = firstNumber + " - " + secondNumber + " = " + Math.subtractExact(firstNumber, secondNumber);
                break;
            case '*':
                str = firstNumber + " * " + secondNumber + " = " + Math.multiplyExact(firstNumber, secondNumber);
                break;
            case '/':
                str = firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber);
                break;
            case '^':
                str = firstNumber + " ^ " + secondNumber + " = " + (int) Math.pow(firstNumber, secondNumber);
                break;
            case '%':
                str = firstNumber + " % " + secondNumber + " = " + (int) Math.IEEEremainder(firstNumber, secondNumber);
                break;
        }
        return str;
    }
}