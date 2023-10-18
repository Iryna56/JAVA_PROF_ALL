package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> strings = new LinkedHashSet<>();   // связное множество которое использует хэш
        strings.add("first");                      // сохраняется порядок вставки, нет дубликатов
        strings.add("second");
        strings.add("third");
        strings.add("last");
        strings.add("change");
        strings.add("first");
        System.out.println(strings);
        HashSet<Integer> set = new HashSet<>();
    }
}
