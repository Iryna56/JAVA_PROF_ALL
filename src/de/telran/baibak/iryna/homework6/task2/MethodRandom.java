package de.telran.baibak.iryna.homework6.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class MethodRandom {
    public static void main(String[] args) {
       randomMethodArrayList();
       randomMethodLinkedList();
    }


    public static void randomMethodArrayList() {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            myArrayList.add(i);
        }
        long before = System.currentTimeMillis();
        Collections.shuffle(myArrayList);
        for (int i = 0; i < 100000; i++) {
//            System.out.println(myArrayList.get(i));

        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
    public static void randomMethodLinkedList() {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (int i = 1; i <= 1000000; i++) {
            myLinkedList.add(i);
        }
        long before = System.currentTimeMillis();
        Collections.shuffle(myLinkedList);
        for (int i = 0; i < 100000; i++) {
//            System.out.print(myLinkedList.get(i));
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
    /*
    Время в ArrayList меньше чем в LinkedList, так как чтобы выбрать элемент из динамического массива компилятор обращается непосредственно
    к ячейке, в то время как в связанном списке он идет к нужному элементу по очереди, поэтому и времени нужно больше.
     */


}