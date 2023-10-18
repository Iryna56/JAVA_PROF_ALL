package de.telran.baibak.iryna.homework2.shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public void calculateArea() {
        int areaCircle = (int) (Math.PI * radius * radius);
        System.out.printf("Площадь круга %d%n", areaCircle);
    }

    @Override
    public void calculatePerimeter() {
        int perimeterCircle = (int) (2 * Math.PI * radius);
        System.out.printf("Периметр круга %d%n", perimeterCircle);
    }
}
