package de.telran.baibak.iryna.homework2.shapes;

public class Triangle extends Shape {
    private int first;
    private int second;
    private int third;

    public Triangle(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public void calculatePerimeter() {
        int perimeterTriangle = first + second + third;
        System.out.printf("Периметр треугольника %d%n", perimeterTriangle);
    }

    @Override
    public void calculateArea() {
        int halfMeter = (first + second + third) / 2;
        int areaTriangle = (int) Math.sqrt(halfMeter * (halfMeter - first) * (halfMeter - second) * (halfMeter - third));
        System.out.printf("Площадь треугольника %d%n", areaTriangle);
    }
}
