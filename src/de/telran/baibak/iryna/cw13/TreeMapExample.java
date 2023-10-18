package de.telran.baibak.iryna.cw13;

import de.telran.baibak.iryna.homework12.Cat;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put("Tom", "groupA");
        treeMap.put("Mary", "groupB");
        treeMap.put("Bill", "groupD");
        treeMap.put("Jane", "groupA");
        treeMap.put("Tim", "groupB");

//        System.out.println(treeMap.get("Jane"));
//        System.out.println(treeMap);

        Map<Cat, Integer> catMap = new TreeMap<>();
        Cat cat1 = new Cat("Tom", 1, "black", true);
        Cat cat2 = new Cat("Tim", 2, "white", false);
        Cat cat3 = new Cat("Jerry", 1, "yellow", true);
        Cat cat4 = new Cat("Stepan", 3, "black", false);
        Cat cat5 = new Cat("Bob", 1, "black", false);
        Cat cat6 = new Cat("Jinny", 2, "grey", true);
        Cat cat7 = new Cat("Timmy", 4, "white", true);
        catMap.put(cat1, 3211);
        catMap.put(cat2, 3213);
        catMap.put(cat3, 3214);
        catMap.put(cat4, 3212);

    }
}
