package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.Comparator;

public class WeightCatsComparator implements Comparator<Cat> {


    @Override
    public int compare(Cat cat1, Cat cat2) {
        int diff = cat1.getWeight() - cat2.getWeight();
        return diff;
    }
}
