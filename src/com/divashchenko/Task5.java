package com.divashchenko;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

    private static final int COLUMN = 3;
    private static final int ROW = 4;

    public static void task5() {
        Random random = new Random();
        int[][] array = new int[ROW][COLUMN];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        showArray(array);
        System.out.println();

        int[][] arrayRev = new int[COLUMN][ROW];

        for (int i = 0; i < arrayRev.length; i++) {
            for (int j = 0; j < arrayRev[i].length; j++) {
                arrayRev[i][j] = array[j][array[i].length - 1 - i];
            }
        }

        showArray(arrayRev);
    }

    private static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
