package de.telran.baibak.iryna.homework9.task1;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        addNumbersToArrayList();
        addNumbersToLinkedList();
        addNumbersToTreeSet();
        addNumbersToHashSet();
    }
    public static void addNumbersToArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        long before = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(random.nextInt(100));
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);

        }
    public static void addNumbersToLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        long before = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(random.nextInt(1000000));
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
    public static void addNumbersToTreeSet() {
        Set<Integer> integerTreeSet = new TreeSet<>();
        Random random = new Random();
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            integerTreeSet.add(random.nextInt());
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
    public static void addNumbersToHashSet() {
        Set<Integer> integerHashSet = new HashSet<>();
        Random random = new Random();
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            integerHashSet.add(random.nextInt());
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    }

    //Быстрее всех сработал HashSet благодаря хешированию, TreeSet  работает медленнее, потому что он сортирует элементы
// ArrayList медленнее, потому что это упорядоченный список, порядок вставки важен, но быстрее по сравнению с LinkedList,
// так как элементы должны связываться, поэтому LinkedList самый медленный

