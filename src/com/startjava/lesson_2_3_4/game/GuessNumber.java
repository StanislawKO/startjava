package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private Scanner scanner = new Scanner(System.in);
    private int number = (int) (Math.random() * 101);
    boolean isTrue = true;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startGame() {
        System.out.println("Загаданное число " + number);

        while (isTrue) {
            guessGame("Первый", p1);
            if (!isTrue) {
                break;
            }

            guessGame("Второй", p2);
            if (!isTrue) {
                break;
            }
        }

        print(p1.getEnteredNumbers(), p1.getCount());
        print(p2.getEnteredNumbers(), p2.getCount());

        p1.clear();
        p2.clear();
    }

    public void print(int[] enteredNumbers, int count) {
        int[] numberCopy = Arrays.copyOf(enteredNumbers, count);
        System.out.println(Arrays.toString(numberCopy));
    }

    public boolean guessGame(String str, Player p) {
        System.out.println();
        System.out.print(str + " игрок вводит число: ");
        int attempt = scanner.nextInt();
        p.setNumber(attempt);
        p.setEnteredNumbers(attempt);
        int enteredNumber = p.getNumber();
        if (enteredNumber == number) {
            System.out.println("Игрок " + p.getName() + " угадал число " + number + " с " + (p.getCount() + 1) + " попытки");
            isTrue = false;
        } else if (enteredNumber > number) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        }
        if (p.getCount() == 9) {
            System.out.println("У " + p.getName() + " закончились попытки");
            if (str.equals("Второй")) {
                isTrue = false;
            }
        }
        int countP = p.getCount();
        p.setCount(++countP);

        return isTrue;
    }
}
