package de.telran.baibak.iryna.cw12;

import java.util.*;

import static de.telran.baibak.iryna.homework12.CatTest.*;

public class CatHouse {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 1, "black", true);
        Cat cat2 = new Cat("Jerry", 2, "white", false);
        Cat cat3 = new Cat("Tim", 3, "yellow", true);
        Cat cat4 = new Cat("Stepan", 4, "black", false);
        Cat cat5 = new Cat("Mursik", 2, "white", true);
        Cat cat6 = new Cat("Pushok", 8, "black", false);
        Cat cat7 = new Cat("Timmy", 8, "grey", true);

        List<Cat> cats = Arrays.asList(cat1,cat2,cat3,cat4,cat5,cat6,cat7);

        //1.Получить Map<String, Boolean> имя, информация, голодна кошка ли нет

        Map<String, Boolean> nameInfoTable = task1(cats);
        System.out.println(nameInfoTable);

        //2.Получить Map<String, Long> цвет, количество кошек данного цвета

        Map<String, Long> colourInfoTable = task2(cats);
        System.out.println(colourInfoTable);



        ////3.Получить Map<String, Set<String> цвет, список имен кошек данного цвета

        Map<String, Set<String>> colourbyNameTable = task3(cats);
        System.out.println(colourbyNameTable);

//        System.out.println(cat1 == cat2); // ссылочное сравнение вернет false

//        System.out.println(cat1.equals(cat2)); // по умолчанию метод Equals сравнивает тоже ссылки

//        System.out.println(cat1.hashCode());
//        System.out.println(cat2.hashCode());



    }

    private static Map<String, Set<String>> task3(List<Cat> cats) {
        Map<String, Set<String>> map = new HashMap<>();
        for (Cat cat:cats) {
            if (map.containsKey(cat.getColour())) {
                Set<String> set = map.get(cat.getColour());
                set.add(cat.getName());
            } else {
                Set<String> newSet = new HashSet<>();
                newSet.add(cat.getName());
                map.put(cat.getColour(), newSet);
            }
        }
        return map;
    }

    private static Map<String, Boolean> task1(List<Cat> cats) {
        Map<String,Boolean> map = new HashMap<>();
        for (Cat c:cats) {
            map.put(c.getName(), c.isHungry());
        }
        return map;
    }

    private static Map<String, Long> task2(List<Cat> cats) {
        Map<String,Long> map = new HashMap<>();

        return null;
    }
}
