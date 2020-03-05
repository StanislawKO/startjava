package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
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