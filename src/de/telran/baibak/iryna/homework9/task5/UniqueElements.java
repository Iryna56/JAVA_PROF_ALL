package de.telran.baibak.iryna.homework9.task5;

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        System.out.println(arrayList.size());

        Set<Integer> treeSet = new TreeSet<>(arrayList);
        System.out.println(treeSet.size());
    }
}
