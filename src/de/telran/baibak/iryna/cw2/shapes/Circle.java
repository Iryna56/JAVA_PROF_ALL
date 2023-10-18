package de.telran.baibak.iryna.cw2.shapes;

public class Circle extends Shape{
    private int radius;

    public Circle() {
    }

    public Circle(String type, int radius) {
        super(type);
        this.radius = radius;
    }

    public Circle(int radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("я рисую круг радиусом %d%n", radius);
    }

    public void drawFast() {
        System.out.println("Начал быстро рисовать");
        draw();
    }

    @Override
    public String toString() {
        return "Это круг радиусом " + radius;
    }
    protected int draw(Object color) {
        return 1;
    }
}
