package com.divashchenko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    private static final int COLUMN = 3;
    private static final int ROW = 4;

    public static void task1() {
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

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= number;
            }
        }

        System.out.println();
        showArray(array);
    }

    private static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
