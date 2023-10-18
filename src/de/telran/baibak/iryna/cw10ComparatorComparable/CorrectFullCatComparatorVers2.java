package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.Comparator;

public class CorrectFullCatComparatorVers2 implements Comparator<Cat> {

    /*сравни сначала год, если год равен, то CatsYearComparator
    * сравни вес, если равен то - Weightcomparator
    * сравни имя - NameCatsComparator
    * CatsYearComparator if eguals then Weightcomparator if eguals then NameCatsComparator
    * CatsYearComparator  thenCompare Weightcomparator  thenCompare NameCatsComparator
    *
    * */
    @Override
    public int compare(Cat cat1, Cat cat2) {
        Comparator<Cat> comp = new CatsYearComparator()
                .thenComparing(new WeightCatsComparator())
                .thenComparing(new NameCatsComparator());
        return comp.compare(cat1, cat2);

    }
    // cat1 2022 3 Барсик
    // cat2 2022 3 Барсик
    // cat3 2023 3
}
