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
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case '/':
                System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                break;
            case '^':
                long result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + result);
                break;
            case '%':
                System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
                break;
        }
    }
}