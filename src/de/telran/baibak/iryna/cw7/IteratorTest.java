package de.telran.baibak.iryna.cw7;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
       // List<Integer> list1 = List.of(10, 13, 4); вариант создания коллекции, но есть о
        //недостаток, данная коллекция ведет себя как обычный массив,нельзя расширять и уменьшать размер
        list.add(3);//
        list.add(5);
        list.add(10);
        list.add(8);
        Iterator<Integer> iterator = list.iterator();
//        i = 0;                     конструкция идентична с циклом for, без метода hasNext  последнее значение будет false
//        while (i < list.size()) {    hasNext - метод в итераторе
//        }
        while (iterator.hasNext()) {// i < list.size(); заменяем на iterator.hasNext()
            //logic

            Integer current = iterator.next();// current = list.get(i); i++; достает элемент на позиции i
//            System.out.println(current);
        }
        for (Integer current : list) {
//            System.out.println(current);
        }
        System.out.println("------------------------------");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {// i < list.size();hasNext - проходим от начала до конца
            //logic
            Integer current = listIterator.next();// current = list.get(i); i++;
            System.out.println(current);
        }
//
        while (listIterator.hasPrevious()){
            Integer current = listIterator.previous();// current = list.get(i); i++; идем обратно
            System.out.println(current);
        }

        Spliterator<Integer> spliterator = list.spliterator();
        spliterator.tryAdvance(System.out::println);

//        ListIterator<Integer> listIterator = list.listIterator();
//        listIterator.next();// переход к элементу
//        listIterator.add(5);// добавление элемента
//        listIterator.next();
//        listIterator.next();
//        listIterator.remove();// удаление элемента
//        System.out.println(listIterator.previous()); // переход к предыдущему элементу
//        System.out.println(listIterator.previous());
//        System.out.println(listIterator.previous());
//        System.out.println(list);


    }


    public int findFirstElemMoreThan5(List<Integer> list) {
//        Iterator<Integer> iterator = list.iterator();
//        Integer current = -1;
//        while (iterator.hasNext()) {// i < list.size();
//            current = iterator.next();
//            if (current > 5) {
//                return current;
//            }
//            //logic
//        }
//        return -1;

        for (Integer current : list) {
            if (current > 5) {
                return current;
            }
        }
        return -1;
    }
}
