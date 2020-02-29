package com.startjava.lesson_2_3.game;

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
        System.out.println("Hidden number " + number);

        while (true) {
            System.out.println();
            System.out.print("The first player enters a number: ");
            p1.setNumber(scanner.nextInt());
            int fistGuess = p1.getNumber();
            if (fistGuess == number) {
                System.out.println("The first player guessed! " + p1.getName());
                break;
            } else if (fistGuess > number) {
                System.out.println("The number you entered is greater than what the computer thought");
            } else {
                System.out.println("The number you entered is less than what the computer thought");
            }
            System.out.println();
            System.out.print("The second player enters a number: ");
            p2.setNumber(scanner.nextInt());
            int secondGuess = p2.getNumber();
            if (secondGuess == number) {
                System.out.println("Guess the second player! " + p2.getName());
                break;
            } else if (secondGuess > number) {
                    System.out.println("The number you entered is greater than what the computer thought");
            } else {
                    System.out.println("The number you entered is less than what the computer thought");
            }
        }
    }
}
