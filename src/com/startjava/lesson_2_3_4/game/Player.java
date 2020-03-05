package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] guess = new int[10];
    private int count = 1;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGuess(int guess, int count) {
        this.guess[count] = guess;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void print(int count) {
        int[] numberCopy = Arrays.copyOf(guess, count);
        System.out.println(Arrays.toString(numberCopy));
    }

    public void clear(int count) {
        Arrays.fill(guess,0, count, 0);
        this.count = 1;
    }
}
