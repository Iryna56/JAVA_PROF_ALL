package de.telran.baibak.iryna.homework2.zoo;

public class Lamb extends Herbivore{

    public Lamb(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public String toString() {
        return "Lamb{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
