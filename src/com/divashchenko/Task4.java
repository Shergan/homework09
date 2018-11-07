package com.divashchenko;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    private static final int COLUMN = 3;
    private static final int ROW = 4;

    public static void task4() {
        Random random = new Random();
        int[][] array = new int[ROW][COLUMN];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        showArray(array);
        System.out.println();

        int sum = 0;
        int tmp = 0;
        int rowNumber = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tmp += array[i][j];
            }
            if (tmp > sum) {
                sum = tmp;
                rowNumber = i;
            }
        }

        System.out.println("Th biggest row is: " + Arrays.toString(array[rowNumber]));

    }

    private static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
