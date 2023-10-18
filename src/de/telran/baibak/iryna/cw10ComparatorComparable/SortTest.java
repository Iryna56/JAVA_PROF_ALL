package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.*;

public class SortTest {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Барсик", 2020));
        cats.add(new Cat("Матроскин", 2021));
        cats.add(new Cat("Барсик", 2022));
        cats.add(new Cat("Барсик", 2023));
        cats.add(new Cat("Кузя", 2020));
        cats.add(new Cat("Барсик", 2020, 4));

        Comparator<Cat> howToSort = new WeightCatsComparator().reversed();  // сортировка в обратном порядке
        /* компаратор можно использовать с Collections.sort и Arrays.sort
        Компаратор говорит, как сравнивать два обьекта, а Comparable  сравнивает себя с обьектом
        Comparable -  естественный порядок (в примере с кошками, мы сказали, что естественный порядок у кошек это год рождения)
        Comparator - пользовательский порядок
        Если сортировка должна быть основана на естественном порядке, то используем Comparable
        Если необходимо выполнить сортировку по характеристикам обьектов, используем Comparator
         */
        // Почему в TreeSet  запрещены null -  потому что мы не знаем, как сравнивать его


//        cats.get(0).compareTo(cats.get(1));
        Collections.sort(cats, howToSort);
        System.out.println(cats);

        Set<Cat> catsSet = new TreeSet<>(new CorrectFullCatComparator());
        catsSet.addAll(cats);
        System.out.print(catsSet.size());



    }
}
