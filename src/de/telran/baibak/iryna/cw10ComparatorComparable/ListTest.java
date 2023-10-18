package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        int x = 1 + 7 * 2;
        System.out.println(x);
        Integer[] array = {3, 4, 12, 6, 3, 2};
        /* как передать массив Integer в List?
        с 9 java  появился дефолтный метод list.of
         с помощью него можно в List  добавить массив данных
         */
        List<Integer> list = List.of(3, 4, 12, 6, 3, 2);  // метод возвращает Unmodifiable Lists
        // данный метод означает, что мы не можем вносить никакие изменения в данную коллекцию


//        List<Integer> list = generateList();   // здесь мы не видим, что приходит на вход(ArrayList, LinkedList, AnotherList)
//        list.get(3);
//        list.add(56);

        Arrays.asList(array); // возвращает new ArrayList<Integer>()

        List<Integer> var = new ArrayList<>(list);    //  мы можем в коллекцию передать массив
        var.addAll(list);                             // добавление всех элементов коллекции
        System.out.println(list);
        System.out.println(var);

    }


    public static List<Integer> generateList() {
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0) {
            return List.of(3, 4, 12, 6, 3, 2);
        } else if (i == 1) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(3);
            list.add(4);
            list.add(5);
            return list;
        } else {
            List<Integer> list = new LinkedList<>();
            list.add(3);
            list.add(4);
            list.add(5);
            return list;

        }
    }





}
