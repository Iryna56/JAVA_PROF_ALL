package de.telran.baibak.iryna.homework9.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class RemoveElementsArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        System.out.println(arrayList);

        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        System.out.println(hashSet);

        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(12);
        arrayList1.add(23);
        arrayList1.add(23);
        arrayList1.add(34);
        arrayList1.add(45);
        arrayList1.add(45);
        arrayList1.add(45);
        arrayList1.add(45);
        arrayList1.add(57);
        arrayList1.add(67);
        arrayList1.add(89);
        System.out.println(arrayList1);
        TreeSet<Integer> treeSet = new TreeSet<>(arrayList1);
        arrayList1.clear();
        treeSet.addAll(arrayList1);
        System.out.println(treeSet);


    }
}

//Input: ArrayList [1, 2, 2, 3, 4, 4, 4]
//Output: [1, 2, 3, 4]
//
//Input: ArrayList  [12, 23, 23, 34, 45, 45, 45, 45, 57, 67, 89]
//Output: [12, 23, 34, 45, 57, 67, 89]