package de.telran.baibak.iryna.cw2.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Circle smallCircle = new Circle(3);
        Circle bigCircle = new Circle(10);
        Triangle smallTriangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(3, 5);
        bigCircle.draw();
        smallTriangle.draw();
        rectangle.draw();
        // Создай фигуру - круг радиусом 7б назови ее средний круг
        // Создай фигуру - квадрат стороной 6, назови ее квадрат
        Shape[] shapes = new Shape[2];
        Shape middleCircle = new Circle(7);
        Shape square = new Square(6);
        shapes[0] = middleCircle;
        shapes[1] = square;
        for (int i = 0; i < shapes.length; i++) {
            drawShape(shapes[i]);
        }
        System.out.println();
        Shape circle = new Circle(3);
        circle.draw();
        Circle dot = new Dot();
        dot.draw("str");


    }

    public static void drawShape(Shape shape) {
        System.out.println("Я начинаю рисовать фигуру");
        shape.draw();
        System.out.println(shape);
        System.out.println("Я закончил рисовать фигуру");
    }






}
