package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner scanner = new Scanner(System.in);
    private int number = (int) (Math.random() * 101);
    private int attempt;
    private boolean isNumberGuessed = true;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Загаданное число " + number);

        while (isNumberGuessed) {
            enterNumber(player1);
            compareNumbers(player1);
            checkAttempt("Первый", player1);
            if (!isNumberGuessed) {
                break;
            }

            enterNumber(player2);
            compareNumbers(player2);
            checkAttempt("Второй", player2);
            if (!isNumberGuessed) {
                break;
            }
        }

        printNumbers(player1.getEnteredNumbers(), player1.getCount());
        printNumbers(player2.getEnteredNumbers(), player2.getCount());

        player1.clear();
        player2.clear();
    }

    public void enterNumber(Player player) {
        System.out.println();
        System.out.print(player.getName() + " игрок вводит число: ");
        attempt = scanner.nextInt();
        player.setEnteredNumber(attempt);
    }

    public boolean compareNumbers(Player player) {
        if (attempt == number) {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " с " + (player.getCount() + 1) + " попытки");
            isNumberGuessed = false;
        } else if (attempt > number) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        }

        return isNumberGuessed;
    }

    public boolean checkAttempt(String str, Player player) {
        if (player.getCount() == 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
            if (str.equals("Второй")) {
                isNumberGuessed = false;
            }
        }
        int countP = player.getCount();
        player.setCount(++countP);

        return isNumberGuessed;
    }

    public void printNumbers(int[] enteredNumbers, int count) {
        int[] numbers = Arrays.copyOf(enteredNumbers, count);
        System.out.println(Arrays.toString(numbers));
    }
}
