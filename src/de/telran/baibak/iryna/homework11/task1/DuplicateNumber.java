package de.telran.baibak.iryna.homework11.task1;

import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 2, 5};

        HashSet<Integer> set = new HashSet<>();

        int duplicateValue = 0;
        int duplicateIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (!set.add(array[i])) {
                duplicateValue = array[i];
                duplicateIndex = i;
                break;
            }
        }

        System.out.println("Задублированный элемент " + duplicateValue + "под индексом " + duplicateIndex);
    }
}
