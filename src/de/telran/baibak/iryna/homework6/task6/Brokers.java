package de.telran.baibak.iryna.homework6.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Brokers {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Braun");
        stringList.add("Weit");
        stringList.add("Ivanov");
        stringList.add("Sidorov");
        stringList.add("Petrov");
        stringList.add("Stown");
        stringList.add("Black");
        stringList.add("Dack");
        stringList.add("Red");
        stringList.add("Ozborn");
        System.out.println(stringList);
        Collections.swap(stringList, 0, 9);
        Collections.swap(stringList, 1, 8);
        Collections.swap(stringList, 2, 7);
        Collections.swap(stringList, 3, 6);
        Collections.swap(stringList, 4, 5);
        System.out.println(stringList);

    }
}
