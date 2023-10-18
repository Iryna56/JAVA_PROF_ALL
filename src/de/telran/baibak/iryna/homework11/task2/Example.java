package de.telran.baibak.iryna.homework11.task2;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        System.out.println(speedStack());               //182
        System.out.println(speedDequeLinkedList());     //190
        System.out.println(speedArrayDeque());          //137

        /* В этих структурах данных все операции вставки и удаления происходять за О(1)
        Но Стек сработал быстрее, чем Deque, потому что у очереди два конца, начало и конец, что немного замедляет процесс
        В то время, как у Стека элементы добавляются и удаляются с конца.
        Быстрее всех сработал ArrayDeque  благодаря своему кольцевому виду.
        Заполнение и удаление происходит сразу с двух сторон.
        * */


    }

    private static long speedArrayDeque() {
        Deque<Integer> deque = new ArrayDeque<>();
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Random random = new Random();
            deque.push(random.nextInt());
        }
        while (!deque.isEmpty()) {
            deque.pop();
        }
        long after = System.currentTimeMillis();
        return after - before;

    }

    private static long speedDequeLinkedList() {
        Deque<Integer> integerDeque = new LinkedList<>();
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Random random = new Random();
            integerDeque.push(random.nextInt());
        }
        while (!integerDeque.isEmpty()) {
            integerDeque.pop();
        }
        long after = System.currentTimeMillis();
        return after - before;

    }

    private static long speedStack() {
        Stack<Integer> integerStack = new Stack<>();
        long before = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            Random random = new Random();
            integerStack.push(random.nextInt());
        }
        while (!integerStack.empty()) {
            integerStack.pop();
        }
        long after = System.currentTimeMillis();

        return after - before;

    }
}
