package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner scanner = new Scanner(System.in);
    private int number = (int) (Math.random() * 101);
    private boolean isNumberGuessed = true;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Загаданное число " + number);

        while (isNumberGuessed) {
            isNumberGuessed = makeMove(player1);
            if (!isNumberGuessed) {
                break;
            }

            isNumberGuessed = makeMove(player2);
            if (!isNumberGuessed) {
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
        return compareNumbers(player) && checkAttempt(player);
    }

    private void enterNumber(Player player) {
        System.out.println();
        System.out.print(player.getName() + " игрок вводит число: ");
        player.setEnteredNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        int[] enteredNumber = player.getEnteredNumbers();
        if (enteredNumber[enteredNumber.length - 1] == number) {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " с " + player.getCount() + " попытки");
            return false;
        } else if (player.getEnteredNumbers()[player.getEnteredNumbers().length - 1] > number) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        }

        return true;
    }

    private boolean checkAttempt(Player player) {
        if (player.getCount() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return isNumberGuessed = false;
        }
        return isNumberGuessed;
    }

    private void printNumbers(Player player) {
        int[] numbers = player.getEnteredNumbers();
        System.out.println(Arrays.toString(numbers));
    }
}
