import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.print("Введите имя первого игрока: ");
        String firstName = new Scanner(System.in).nextLine();
        Player playerFirst = new Player(firstName);
        System.out.print("Введите имя второго игрока: ");
        String secondName = new Scanner(System.in).nextLine();
        Player playerSecond = new Player(secondName);
        System.out.println("Играют " + playerFirst.getName() + " и " + playerSecond.getName());

        GuessNumber game = new GuessNumber();
        game.startGame();
    }
}
