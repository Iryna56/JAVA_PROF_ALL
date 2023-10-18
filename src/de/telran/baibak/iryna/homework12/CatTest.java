package de.telran.baibak.iryna.homework12;

import java.util.*;

public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 1, "black", true);
        Cat cat2 = new Cat("Tim", 2, "white", false);
        Cat cat3 = new Cat("Jerry", 1, "yellow", true);
        Cat cat4 = new Cat("Stepan", 3, "black", false);
        Cat cat5 = new Cat("Bob", 1, "black", false);
        Cat cat6 = new Cat("Jinny", 2, "grey", true);
        Cat cat7 = new Cat("Timmy", 4, "white", true);
        List<Cat> cats = Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7);

        System.out.println(task1(cats));
        System.out.println(task2(cats));
        System.out.println(task3(cats));
    }
    public static Map<String, Set<String>> task3 (List<Cat> cats) {
        Map<String, Set<String>> map = new HashMap<>();
        for (Cat cat : cats) {
            if(map.containsKey(cat.getColor())) {
                    Set<String> set = map.get(cat.getColor());
                    set.add(cat.getName());
                } else {
                Set<String> newSet = new HashSet<>();
                newSet.add(cat.getName());
                map.put(cat.getColor(), newSet);
            }
            }
                return map;
        }

    public static Map<String, Integer> task2 (List<Cat> cats) {
        Map<String, Integer> map = new HashMap<>();
        for (Cat cat : cats) {
            map.put(cat.getColor(), map.getOrDefault(cat.getColor(), 0) + 1);
        }
        return map;
    }

    public static Map<String, Boolean> task1(List<Cat> cats) {
        Map<String, Boolean> map = new HashMap<>();
        for (Cat cat : cats) {
            map.put(cat.getName(), cat.isHungry());
        }
        return map;
    }



//    public static Map<String, Boolean> task1(List<Cat> cats) {
//        Map<String, Boolean> map = new HashMap<>();
//
//
//    }
}
