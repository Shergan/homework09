package com.divashchenko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {

    public static void task8() {
        Random random = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Please, input a number of rows ( > 0 and < 101): ");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = 0;
        numberOfRows = scanner.nextInt();

        if (numberOfRows < 1 || numberOfRows > 100) {
            throw new IllegalArgumentException("Wrong number!");
        }

        int colums = 0;
        if (array.length % numberOfRows == 0) {
            colums = array.length / numberOfRows;
        } else {
            colums = array.length / numberOfRows + 1;
        }

        int[][] arrayNew = new int[numberOfRows][colums];
        int k = 0;

        for (int i = 0; i < arrayNew.length; i++) {
            for (int j = 0; j < arrayNew[i].length; j++) {
                if (k < array.length) {
                    arrayNew[i][j] = array[k];
                    k++;
                } else {
                    arrayNew[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arrayNew.length; i++) {
            System.out.println(Arrays.toString(arrayNew[i]));
        }
    }
}
