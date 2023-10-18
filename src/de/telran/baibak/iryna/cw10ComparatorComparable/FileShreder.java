package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileShreder {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        files.add(new File("Harry Potter", "Some text about Garry"));
        files.add(new File("Draft", "Some text about Garry"));
        files.add(new File("Any text", "Some text "));
        files.add(new File("Spam", "Some text about"));

        Collections.sort(files, new ShrederComparatot());
        System.out.println(files);
    }
}
