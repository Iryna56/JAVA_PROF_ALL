package de.telran.baibak.iryna.homework2.shapes;

public class Square extends Shape {

    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public void calculatePerimeter() {
        int perimeterSquare = 4 * size;
        System.out.printf("Периметр квадрата %d%n", perimeterSquare);
    }

    @Override
    public void calculateArea() {
        int areaSquare = size * size;
        System.out.printf("Площадь квадрата %d%n", areaSquare);
    }
}
