package de.telran.baibak.iryna.homework12;

public class Cat {
    private String name;
    private int age;
    private String color;
    private boolean isHungry;

    public Cat(String name, int age, String color, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }


}
//1. Получить Map<String, Boolean> имя / информация, голодна ли кошка
//2. Получить Map<String, Long> цвет / количество кошек данного цвета
//3*. Получить Map<String, Set<String>> цвет / список имен кошек данного цвета
