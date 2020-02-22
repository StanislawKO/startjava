import java.util.Scanner;

public class GuessNumber {
    public void startGame() {
        while (true) {
            int number = (int) (Math.random() * 100);
            System.out.println("Загаданное число " + number);

            while (true) {
                System.out.print("Первый игрок вводит число: ");
                int firstNumber = new Scanner(System.in).nextInt();
                if (firstNumber != number) {
                    if (firstNumber > number) {
                        System.out.println("Введенное вами число больше того, что загадал компьютер");
                    } else {
                        System.out.println("Введенное вами число меньше того, что загадал компьютер");
                    }
                } else {
                    System.out.println("Угадал первый игрок!");
                    break;
                }
                System.out.print("Второй угрок вводит число: ");
                int secondNumber = new Scanner(System.in).nextInt();
                if (secondNumber != number) {
                    if (secondNumber > number) {
                        System.out.println("Введенное вами число больше того, что загадал компьютер");
                    } else {
                        System.out.println("Введенное вами число меньше того, что загадал компьютер");
                    }
                } else {
                    System.out.println("Угадал второй игрок!");
                    break;
                }
            }
            System.out.println("Хотите продолжить? [да/нет]: ");
            String answer = new Scanner(System.in).nextLine();
            if (answer.equals("нет")) {
                break;
            }
        }
    }
}
