import java.util.Scanner;

public class GuessNumberTest {
    private static Player p1;
    private static Player p2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        p1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        p2 = new Player(scanner.nextLine());
        System.out.println("Играют " + p1.getName() + " и " + p2.getName());

        String answer;
        do {
            GuessNumber game = new GuessNumber(p1, p2);
            game.startGame();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}
