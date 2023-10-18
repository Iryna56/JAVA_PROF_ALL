package de.telran.baibak.iryna.homework2.zoo;

public class Predator extends Animal {

        @Override
    public void eat(String food) {
        super.eat(food);
        if (food == "meat") {
            System.out.printf("Я ем мясо %n");
        }

    }
    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public String toString() {
        return "Predator{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
