package de.telran.baibak.iryna.homework10.task1;

import java.util.Comparator;

public class Child {
    /*Дети стоят на физкультуре по убыванию роста.
    Отсортируй детей, предварительно подумав, что лучше использовать при таких условиях
    - Comparable или Comparator. Реализовать класс Child. Можно с одним полем - рост.
    Создать коллекцию детей и отсортировать ее.
    Что Вы используете - Comparable или Comparator - выбирать Вам, но нужно объяснить свой выбор.

    Здесь я использую компаратор, потому что мне нужно установить свой порядок сортировки - по росту, плюс в обратном порядке
    */

    private int height;

    public Child(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Child{" +
                "height=" + height +
                '}';
    }

}
