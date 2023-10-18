package de.telran.baibak.iryna.homework7.task1;

import java.util.*;

public class MyList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            list.add(random.nextInt(10000000));
        }
        iterateElementsFor(list);
        iterateElementsForEnd(list);
        iterateElementsForEach(list);
        iterateElementsIterator(list);
        iterateElementsListIterator(list);
    }

    public static void iterateElementsFor(List<Integer> list) {
        long before = System.currentTimeMillis();
        int tempVal = 0;
        for (int i = 0; i < list.size(); i++) {
            tempVal = list.get(i);
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }


    public static void iterateElementsForEnd(List<Integer> list) {
        long before = System.currentTimeMillis();
        int tempVal = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            tempVal = list.get(i);
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);

    }

    public static void iterateElementsForEach(List<Integer> list) {
        long before = System.currentTimeMillis();
        int tempVal = 0;
        for (Integer integer : list) {
            tempVal = integer;
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    public static void iterateElementsIterator(List<Integer> list) {
        long before = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int tempVal = iterator.next();
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    public static void iterateElementsListIterator(List<Integer> list) {
        long before = System.currentTimeMillis();
        Iterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int tempVal = listIterator.next();
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
// Быстрее работает ListIterator и ForEach