package de.telran.baibak.iryna.homework7.task3;

import java.util.*;

public class MyListIterator {
    public static void main(String[] args) {
        Integer[] array = new Integer[15];
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(20);
            list.add(array[i]);
        }


        System.out.println(list);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer current = listIterator.next();
            System.out.println(current);
        }
        System.out.println("----------------------------");
        while (listIterator.hasPrevious()) {
            Integer current = listIterator.previous();
            System.out.println(current);
        }

    }
}
    /*я должна пройтись сначала в конец, а потом в обратном порядке. Есть ли вариант итерироваться сразу с конца?
    Я понимаю, что если я закоментирую первый цикл - проход в конец, то второй цикл выдаст false и не сработает,
    потому что нет предыдущего элемента. Но как сразу начать итерацию с конца? В этом не смогла разобраться
     */



