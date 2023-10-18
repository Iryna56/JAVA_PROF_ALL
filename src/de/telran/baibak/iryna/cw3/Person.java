package de.telran.baibak.iryna.cw3;

import java.io.Serializable;

public class Person implements Jumpable, Danceable, Serializable, Cloneable {

    @Override
    public void jump() {
        System.out.printf("Я прыгаю на один метр");
    }

    @Override
    public void jump(int lenght) {
        System.out.printf("Я прыгаю на " + lenght + "метров");
    }

    @Override
    public void dance() {

    }
}
