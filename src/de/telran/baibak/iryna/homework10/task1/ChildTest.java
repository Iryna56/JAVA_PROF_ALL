package de.telran.baibak.iryna.homework10.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ChildTest {
    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();
        children.add(new Child(150));
        children.add(new Child(155));
        children.add(new Child(145));
        children.add(new Child(148));
        children.add(new Child(139));
        children.add(new Child(141));
        children.add(new Child(138));

        Comparator<Child> sort = new ChildHeightComparator().reversed();
        Collections.sort(children, sort);
        System.out.println(children);

    }
}
