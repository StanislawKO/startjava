import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "да";
        while (answer.equals("да")) {
            GuessNumber game = new GuessNumber();
            game.startGame();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}
