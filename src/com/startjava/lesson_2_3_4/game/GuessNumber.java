package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner scanner = new Scanner(System.in);
    private int number = (int) (Math.random() * 101);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Загаданное число " + number);

        while (makeMove(player1) && makeMove(player2)) {
            if (!makeMove(player1)) {
                break;
            }

            if (!makeMove(player2)) {
                break;
            }
        }

        printNumbers(player1);
        printNumbers(player2);

        player1.clear();
        player2.clear();
    }

    private boolean makeMove(Player player) {
        enterNumber(player);
        return compareNumbers(player) && checkAttempt();
    }

    private void enterNumber(Player player) {
        System.out.println();
        System.out.print(player.getName() + " игрок вводит число: ");
        player.setEnteredNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        int enteredNumber = player.getEnteredNumbers()[player.getEnteredNumbers().length - 1];
        if (enteredNumber == number) {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " с " + player.getCount() + " попытки");
            return false;
        } else if (player.getEnteredNumbers()[player.getEnteredNumbers().length - 1] > number) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        }

        return true;
    }

    private boolean checkAttempt() {
        if (player1.getCount() == 10 && player2.getCount() < 10) {
            System.out.println("У " + player1.getName() + " закончились попытки");
        } else if (player2.getCount() == 10) {
            System.out.println("У " + player2.getName() + " закончились попытки");
            return false;
        }
        return true;
    }

    private void printNumbers(Player player) {
        int[] numbers = player.getEnteredNumbers();
        System.out.println(Arrays.toString(numbers));
    }
}
