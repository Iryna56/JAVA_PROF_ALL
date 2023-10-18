package de.telran.baibak.iryna.homework2.zoo;

public class Cow extends Herbivore{
    public Cow(String name, String color) {
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
        return "Cow{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
