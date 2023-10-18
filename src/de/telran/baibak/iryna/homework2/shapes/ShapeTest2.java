package de.telran.baibak.iryna.homework2.shapes;

public class ShapeTest2 {
    public static void main(String[] args) {
        Circle circle = new Circle(16);
        Triangle triangle = new Triangle(25, 28, 30);
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(15, 20);



        circle.calculateArea();
        circle.calculatePerimeter();
        triangle.calculateArea();
        triangle.calculatePerimeter();
        square.calculateArea();
        square.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();


    }
}
