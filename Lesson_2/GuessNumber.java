import java.util.Scanner;

public class GuessNumber {
    public void startGame(Player p1, Player p2) {
        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 100);
        System.out.println("Загаданное число " + number);

        while (true) {
            System.out.print("Первый игрок вводит число: ");
            p1.setNumber(scanner.nextInt());
            int fistGuess = p1.getNumber();
            if (fistGuess != number) {
                if (fistGuess > number) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                }
            } else {
                System.out.println("Угадал первый игрок!");
                break;
            }
            System.out.print("Второй угрок вводит число: ");
            p2.setNumber(scanner.nextInt());
            int secondGuess = p2.getNumber();
            if (secondGuess != number) {
                if (secondGuess > number) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                }
            } else {
                System.out.println("Угадал второй игрок!");
                break;
            }
        }
    }
}
