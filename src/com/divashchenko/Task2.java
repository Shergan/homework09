package com.divashchenko;

import java.util.Random;

public class Task2 {

    private static final int COLUMN = 3;
    private static final int ROW = 4;

    public static void task2() {
        Random random = new Random();
        int[][] array = new int[ROW][COLUMN];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                sum += array[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
