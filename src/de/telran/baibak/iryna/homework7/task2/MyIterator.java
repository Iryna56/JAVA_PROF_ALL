package de.telran.baibak.iryna.homework7.task2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MyIterator {
    public static void main(String[] args) {


        Integer[] array = new Integer[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(20);
        }
        List<Integer> list = List.of(array);
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }



    /*Напишите свой итератор для перебора элементов в массиве.
    Проверьте работу используя вызов итератора*/

    }

