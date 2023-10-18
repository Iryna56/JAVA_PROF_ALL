package de.telran.baibak.iryna.cw11StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyArrayDequeTest {
    public static void main(String[] args) {
        MyArrayDeque deque = new MyArrayDeque();
        for (int i = 0; i < 10; i++) {
            deque.addFirst(i);
        }
// 9 8 7 6 5 4 3 2 1 0 10 11 12 13 14 15 .. 19
        for (int i = 10; i < 20; i++) {
            deque.addLast(i);
        }


        for (int i = 0; i < 10; i++) {
            deque.removeLast();
        }
    }
}
