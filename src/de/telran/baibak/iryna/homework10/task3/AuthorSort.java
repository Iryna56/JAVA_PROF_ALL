package de.telran.baibak.iryna.homework10.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AuthorSort {
    public static void main(String[] args) {


        Author author = new Author("Ivanov", 1989);
        Author author1 = new Author("Petrov", 1988);
        Author author2 = new Author("Sidorov", 1985);
        Author author3 = new Author("Pupkin", 1984);

        List<Author> listAuthors = new ArrayList<>();
        listAuthors.add(author);
        listAuthors.add(author1);
        listAuthors.add(author2);
        listAuthors.add(author3);

        Collections.sort(listAuthors, new AuthorsYearComparator().thenComparing(new AuthorsSurnameComparator()));
        System.out.println(listAuthors);

    }
}
