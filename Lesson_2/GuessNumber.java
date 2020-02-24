import java.util.Scanner;

public class GuessNumber {
    Player p1;
    Player p2;

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        p1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        p2 = new Player(scanner.nextLine());
        System.out.println("Играют " + p1.getName() + " и " + p2.getName());

        int number = (int) (Math.random() * 100);
        System.out.println("Загаданное число " + number);

        while (true) {
            p1.guess();
            p2.guess();
            int fistGuess = p1.getNumber();
            int secondGuess = p2.getNumber();
            System.out.println("Первый игрок вводит число: " + fistGuess);
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
            System.out.println("Второй угрок вводит число: " + secondGuess);
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
