package de.telran.baibak.iryna.homework3.task4;

public class PopSinger implements Dancable, Singable{
    @Override
    public void dance() {
        System.out.println("Я умею танцевать");
    }
    @Override
    public void sing() {
        System.out.println("Я умею петь");
    }
}
