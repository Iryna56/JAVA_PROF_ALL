package de.telran.baibak.iryna.homework9.task2;

import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public class RandomTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            treeSet.add(random.nextInt(100));
        }
        System.out.println(treeSet.floor(56));
        System.out.println(treeSet.ceiling(70));
        System.out.println(treeSet.higher(40));
        System.out.println(treeSet.lower(10));
        System.out.println(treeSet.subSet(10, true, 30, false));
        System.out.println(treeSet.subSet(30, true, 40, true));
        System.out.println(treeSet.subSet(40, false, 50, true));
        System.out.println(treeSet.headSet(40));

    }
}
//Найти ближайшее число меньше или равное 56
//Найти ближайшее число больше или равное 70
//Найти ближайшее число больше 40
//Найти ближайшее число меньше 10
//Достать множество объектов в промежутке от 10 до 30 (не включая 30) - [10..30)
//Достать множество объектов в промежутке от 30 до 40 (включая 30 и 40) - [30..40]
//Достать множество объектов в промежутке от 40 до 50 (не включая 40, но включая 50) - (40..50]
//Достать множество объектов меньше 40
