package de.telran.baibak.iryna.cw7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer current = listIterator.next();
            System.out.print(" " + current + " ");
        }
//        for (Integer current : list ) {  // цикл foreach является итератором
//                                          // поэтому он является итератором с методом hasNext под капотом
//        }
    }
}
