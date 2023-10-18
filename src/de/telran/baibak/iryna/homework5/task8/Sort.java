package de.telran.baibak.iryna.homework5.task8;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] sortArray = {-2, 45, 0, 11, -9};
        for (int i = 0; i < sortArray.length; i++) {

        }
        System.out.println(Arrays.toString(sortArray));

        boolean sortFinish = true;
        int change;
        while (sortFinish) {
            sortFinish = false;
            for (int i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i] > sortArray[i + 1]) {
                    sortFinish = true;

                    change = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = change;
                }
                System.out.println(Arrays.toString(sortArray));
            }

        }
    }
}


