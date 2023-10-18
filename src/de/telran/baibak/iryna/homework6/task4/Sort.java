package de.telran.baibak.iryna.homework6.task4;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            arrayList.add(random.nextInt(30));
        }
        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
        sort(arrayList);
        System.out.println(arrayList);
    }

    public static void sort(List<Integer> list) {
//        List<Integer> copy = new ArrayList<>(list);
//        list.clear();
        for (int i = 0; i < list.size(); i++) {
            int max = list.get(0);
            int maxIndex = 0;
            for (int j = 0; j < list.size() - i; j++) {

                if (max < list.get(j)) {
                    max = list.get(j);
                    maxIndex = j;
                }
            }

            int tmp = list.get(list.size() - 1 - i);
            max = list.get(list.size() - 1 - i);
            tmp = list.get(maxIndex);




        }
    }
    //данный метод я взяла из классной работы, но он почему-то у меня не сработал, компилятор вывел массив неотсортированный
    //я понимаю, что взяла пример как для обычного массива, со списком нужно что-то поменять, но я не пойму что
    //я создавала копию , но все равно не получилось
    //поэтому я воспользовалась методом sort
}
