package de.telran.baibak.iryna.homework2.shapes3D;

public class Cylinder extends Shape3D{
    int radius;
    int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void volume() {
        super.volume();
        int Volume = (int) (Math.PI * (radius * radius) * height);
        System.out.printf("Обьем цилиндра %d%n", Volume);
    }
}
