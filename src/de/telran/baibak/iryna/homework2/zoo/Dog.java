package de.telran.baibak.iryna.homework2.zoo;

public class Dog extends Predator{

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
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
