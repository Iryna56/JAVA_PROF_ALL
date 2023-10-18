package de.telran.baibak.iryna.cw11StackQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    /* Queue наследуется от Collection и является интерфейсом, поэтому реализацией является LinkedList
    offer -  добавление элемента в  очереди
    remove -  удаление элемента с конца очереди, если очередь пустая, метод вернет ошибку
    poll - тоже удаление элемента, но в случае если очередь пустая, то вернет null
    peek - посмотреть элемент
    element -  посмотреть элемент, в случае если элемента нет, то вернет ошибку
    isEmpty -  проверка на наличие элементов в списке
    FIFO - первый пришел первый ушел
    * */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Test");
        queue.offer("Test1");
        queue.offer("Test2");
        queue.offer("Test3");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        /*Deque интерфейс, который позволяет реализовать возможность Стека

        Обратная совместимость- когда код написанный на 17 джаве может запускаться на первой джаве
        * */
        System.out.println("---------------------------------");
        Deque<String> deque = new LinkedList<>();
        deque.push("Test");
        deque.push("Test4");
        deque.push("Test6");
        deque.push("Test7");

        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }

//        PriorityQueue -  очередь приоритетов


    }
}
