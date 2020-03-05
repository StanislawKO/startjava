package com.startjava.lesson_2_3_4.game;

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

        while (true){
            System.out.println();
            System.out.print("Первый игрок вводит число: ");
            int guessOne = scanner.nextInt();
            p1.setNumber(guessOne);
            p1.setGuess(guessOne, p1.getCount() - 1);
            int fistGuess = p1.getNumber();
            if (fistGuess == number) {
                System.out.println("Игрок " + p1.getName() + " угадал число " + number + " с " + p1.getCount() + 1 + " попытки");
                break;
            } else if (fistGuess > number) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
            if (p1.getCount() == 10) {
                System.out.println("У " + p1.getName() + " закончились попытки");
            }
            int countP1 = p1.getCount();
            p1.setCount(++countP1);
            System.out.println();
            System.out.print("Второй игрок вводит число: ");
            int guessTwo = scanner.nextInt();
            p2.setNumber(guessTwo);
            p2.setGuess(guessTwo, p2.getCount() - 1);
            int secondGuess = p2.getNumber();
            if (secondGuess == number) {
                System.out.println("Игрок " + p2.getName() + " угадал число " + number + " с " + p2.getCount() + " попытки");
                break;
            } else if (secondGuess > number) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                    System.out.println("TВведенное вами число меньше того, что загадал компьютер");
            }
            if (p2.getCount() == 10) {
                System.out.println("У " + p2.getName() + " закончились попытки");
                break;
            }
            int countP2 = p2.getCount();
            p2.setCount(++countP2);
        }

        p1.print(p1.getCount());
        p2.print(p2.getCount());

        p1.clear(p1.getCount());
        p2.clear(p2.getCount());
    }
}
