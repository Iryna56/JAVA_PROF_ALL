package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.Comparator;

public class ShrederComparatot implements Comparator<File> {

    @Override
    public int compare(File file1, File file2) {
        return Integer.compare(file1.getName().length(), file2.getName().length());
    }
}
