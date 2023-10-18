package de.telran.baibak.iryna.cw4;

import de.telran.baibak.iryna.homework2.zoo.Animal;
import de.telran.baibak.iryna.homework2.zoo.Cow;

public class ReferenceTest {
    public static void main(String[] args) {
        Animal animal = new Cow("burenka", "black");
        Animal cow = animal;
        Animal cow2 = new Cow("burenka", "white");
        System.out.println(animal == cow);
        System.out.println(animal.equals(cow2));// true / false
    }
}

