package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.Comparator;

public class CatsYearComparator implements Comparator<Cat> {


    @Override
    public int compare(Cat cat1, Cat cat2) {
//        int diff = cat1.getBirthYear() - cat2.getBirthYear();  можно не делать промежуточную переменную
        return Integer.compare(cat1.getBirthYear(), cat2.getBirthYear());  // это второй вариант
//        return cat1.getBirthYear() - cat2.getBirthYear();
    }
}
