package com.divashchenko;

import java.util.Arrays;
import java.util.Random;

public class Task7 {

    private static final Random random = new Random();

    public static void task7() {
        int[] diceTry = new int[3];
        int numberOfTry = 100000;
        int count = 0;

        for (int i = 0; i < numberOfTry; i++) {
            for (int j = 0; j < diceTry.length; j++) {
                diceTry[j] = rollDice();
            }
            Arrays.sort(diceTry);
            if (diceTry[0] == diceTry[1] - 1 && diceTry[2] == diceTry[1] + 1) {
                count++;
            }
        }

        System.out.println("Chance: " + ((double) count / numberOfTry * 100));
    }

    private static int rollDice() {
        return random.nextInt(6) + 1;
    }
}
