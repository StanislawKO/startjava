package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];
    private int count = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, count);
    }

    public void setEnteredNumber(int number) {
        enteredNumbers[count] = number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public void clear() {
        Arrays.fill(enteredNumbers, 0, count, 0);
        count = 0;
    }
}
