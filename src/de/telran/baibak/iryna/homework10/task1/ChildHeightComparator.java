package de.telran.baibak.iryna.homework10.task1;

import java.util.Comparator;

public class ChildHeightComparator implements Comparator<Child> {
    @Override
    public int compare(Child child1, Child child2) {
        return child1.getHeight() - child2.getHeight();
    }
}
