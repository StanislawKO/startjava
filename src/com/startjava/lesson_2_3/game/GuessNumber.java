import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 101);
        System.out.println("Загаданное число " + number);

        while (true) {
            System.out.println();
            System.out.print("Первый игрок вводит число: ");
            p1.setNumber(scanner.nextInt());
            int fistGuess = p1.getNumber();
            if (fistGuess == number) {
                System.out.println("Угадал первый игрок! " + p1.getName());
                break;
            } else if (fistGuess > number) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
            System.out.println();
            System.out.print("Второй угрок вводит число: ");
            p2.setNumber(scanner.nextInt());
            int secondGuess = p2.getNumber();
            if (secondGuess == number) {
                System.out.println("Угадал второй игрок! " + p2.getName());
                break;
            } else if (secondGuess > number) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
        }
    }
}
