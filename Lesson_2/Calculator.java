public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calc(char sign) {
        switch (sign) {
            case ('+'):
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case ('-'):
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case ('*'):
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case ('/'):
                System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                break;
            case ('^'):
                long result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + result);
                break;
            case ('%'):
                System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
                break;
        }
    }
}