package de.telran.baibak.iryna.homework10.task3;

import java.util.Comparator;

public class AuthorsSurnameComparator implements Comparator<Author> {
    @Override
    public int compare(Author author1, Author author2) {
        return author1.getSurname().compareTo(author2.getSurname());
    }
}
