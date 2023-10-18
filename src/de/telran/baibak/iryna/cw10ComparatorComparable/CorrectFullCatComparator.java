package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.Comparator;

public class CorrectFullCatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        int diff = cat1.getBirthYear() - cat2.getBirthYear();
        if (diff== 0) {
            int weightDiff = cat1.getWeight() - cat2.getWeight();
            if(weightDiff == 0) {
                // сравниваем по имени
                int nameOrder = cat1.getName().compareTo(cat1.getName());

            }
            return weightDiff;
        } else {
            return diff;
        }

    }
    // cat1 2022 3 Барсик
    // cat2 2022 3 Барсик
    // cat3 2023 3
}
