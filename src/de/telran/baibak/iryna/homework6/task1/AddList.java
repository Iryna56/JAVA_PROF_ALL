package de.telran.baibak.iryna.homework6.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class AddList {
    public static void main(String[] args) {
        addArrayAndLinkedList();

        }
        public static void addArrayAndLinkedList() {
            ArrayList<Integer> myArrayList = new ArrayList<>(1000000);
            LinkedList<Integer> myLinkedList = new LinkedList<>();
            Random random = new Random();
            for (int i = 1; i <= 1000000; i++) {
                myArrayList.add(i);
                myLinkedList.add(random.nextInt(1000000));
            }



        }
    }
