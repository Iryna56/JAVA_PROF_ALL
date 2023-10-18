package de.telran.baibak.iryna.cw2.shapes;

public class Square extends Shape {

    private int size;

    public Square(int size) {
        super("квадрат");
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }
}
