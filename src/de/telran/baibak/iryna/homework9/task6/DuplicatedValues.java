package de.telran.baibak.iryna.homework9.task6;

import java.util.*;

public class DuplicatedValues {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(random.nextInt(1, 100));
        }

        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();
        for (Integer element : arrayList) {
            if (!uniqueElements.add(element)) {
                // Элемент уже был добавлен, это дубликат
                duplicateElements.add(element);
            }
        }

        int duplicateCount = duplicateElements.size();
        System.out.println(duplicateCount);

    }
}



