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
        this.enteredNumbers[count] = number;
        incCount(count);
    }

    public int getCount() {
        return count;
    }

    private void incCount(int count) {
        this.count = ++count;
    }

    public void clear() {
        Arrays.fill(enteredNumbers, 0, count, 0);
        this.count = 0;
    }
}
