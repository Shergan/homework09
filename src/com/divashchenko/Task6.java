package com.divashchenko;

import java.util.Random;

public class Task6 {

    private static final Random random = new Random();

    public static void task6() {

        boolean try1;
        boolean try2;
        boolean try3;

        int numberOfTry = 100000;
        int count = 0;

        for (int i = 0; i < numberOfTry; i++) {
            try1 = coinToss();
            try2 = coinToss();
            try3 = coinToss();

            if (try1 == try2 && try2 == try3) {
                count++;
            }
        }

        System.out.println("Chance: " + ((double) count / numberOfTry * 100));
    }

    private static boolean coinToss() {
        return random.nextBoolean();
    }
}
