package de.telran.baibak.iryna.cw10ComparatorComparable;

import java.util.Objects;

public class Cat implements Comparable<Cat>{

    /* Comparable  означает, что мы должны сделать обьект сравнимым
    и с чем будет сравниваться обьект - указываем в <>
     */
    private String name;
    private int birthYear;
    private int weight;

    public Cat(String name, int birthYear, int weight) {
        this.name = name;
        this.birthYear = birthYear;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cat(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.weight = 4;
    }
//  по умолчанию сортируются по году рождения
    @Override
    public int compareTo(Cat o) {    // > < ==         используется для сортировки - параметр сортировки мы определяем самостоятельно
        int diff = this.birthYear - o.birthYear;  // 2020 - 2022 = -2
        return diff;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {   // == !=          используется для четкого сравнения - равно или не равно
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return birthYear == cat.birthYear && weight == cat.weight && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear, weight);
    }
}
