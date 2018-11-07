package com.divashchenko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    private static final int COLUMN = 3;
    private static final int ROW = 4;

    public static void task3() {
        Random random = new Random();
        int[][] array = new int[ROW][COLUMN];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        showArray(array);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input a number: ");
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    count++;
                }
            }
        }

        System.out.println();
        System.out.println("Count: " + count);
    }

    private static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
