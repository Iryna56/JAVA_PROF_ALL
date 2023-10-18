package de.telran.baibak.iryna.cw1;

import de.telran.baibak.iryna.cw1.Cat;

public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Barsik");
        System.out.println(cat.getName());

    }
}
