package de.telran.baibak.iryna.homework9.task7;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedList {
    public static void main(String[] args) {
        List<Integer> list1 = new java.util.LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        System.out.println(list1);
        List<Integer> list2 = new java.util.LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);
        System.out.println(sortList(list1, list2));

    }

    public static List<Integer> sortList(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        return new java.util.LinkedList<>(set);
    }

}

