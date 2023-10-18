package de.telran.baibak.iryna.homework10.task3;

import java.util.Comparator;

public class Author implements Comparable<Author>{

    /*Создайте объект автора(имя, фамилия, год рождения),
    издательство(название, год основания),
    книгу(автор, год публикации, название, издательство)
    Отсортируйте авторов по году рождения и фамилии
    * */

    private String name;
    private String surname;
    private int birthYear;

    public Author(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public Author(String surname, int birthYear) {
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public int compareTo(Author o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
