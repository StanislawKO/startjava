package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];
    private int count = 0;

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

    public int[] getEnteredNumbers() {
        int[] enteredNumbersCopy = Arrays.copyOf(enteredNumbers, count);
        return enteredNumbersCopy;
    }

    public void setEnteredNumber(int number) {
        this.enteredNumbers[count] = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void clear() {
        Arrays.fill(enteredNumbers, 0, count, 0);
        this.count = 0;
    }
}
