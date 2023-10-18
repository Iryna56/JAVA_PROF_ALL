package de.telran.baibak.iryna.homework2.zoo;

public class Herbivore extends Animal{
    public Herbivore(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat(String food) {

        if(food == "meat") {
            System.out.printf("Я такое не ем %n");
        }
    }

    @Override
    public void voice() {
        super.voice();
    }

}
