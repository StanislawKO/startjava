package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the first player: ");
        Player p1 = new Player(scanner.nextLine());
        System.out.print("Enter the name of the second player: ");
        Player p2 = new Player(scanner.nextLine());
        System.out.println("Game " + p1.getName() + " and " + p2.getName());

        String answer;
        do {
            GuessNumber game = new GuessNumber(p1, p2);
            game.startGame();

            do {
                System.out.print("Want to continue? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
