package de.telran.baibak.iryna.homework2.shapes;

public class Rectangle extends Shape {
    private int first;
    private int second;

    public Rectangle(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void calculatePerimeter() {
        int perimeterRectangle = 2 * first + 2 * second;
        System.out.printf("Периметр прямоугольника %d%n", perimeterRectangle);
    }

    @Override
    public void calculateArea() {
        int areaRectangle = first * second;
        System.out.printf("Площадь прямоугольника %d%n", areaRectangle);
    }
}
