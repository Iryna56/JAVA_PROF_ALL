package de.telran.baibak.iryna.homework10.task2;

import java.util.Objects;

public class Ad implements Comparable<Ad>{
    /*Создайте класс для объекта объявление, у объявления есть цена,
     название, описание, автор и год публикации,
     создайте объект газеты и заполните его 10 объявлениями, отсортируйте их,
      в первую очередь важен год, после название, автор и в последнюю очередь описание
    * */

    private int price;
    private String description;
    private String name;
    private String author;
    private int year;


    public Ad(int price, String description, String name, String author, int year) {
        this.price = price;
        this.description = description;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad ad = (Ad) o;
        return price == ad.price && year == ad.year && Objects.equals(description, ad.description) && Objects.equals(name, ad.name) && Objects.equals(author, ad.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, name, author, year);
    }

    @Override
    public String toString() {
        return "Ad{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Ad o) {
        return 0;
    }
}
