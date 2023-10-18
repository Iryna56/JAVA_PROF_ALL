package de.telran.baibak.iryna.homework2.zoo;

public abstract class Animal {
    String name;
    String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void voice() {}
    public void eat(String food) {}
    public void jump(String whoJump, int howJump) {}
    public void jump(double howJump, String whoJump) {}

}
