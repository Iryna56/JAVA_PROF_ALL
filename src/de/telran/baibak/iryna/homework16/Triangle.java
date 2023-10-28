package de.telran.baibak.iryna.homework16;

import java.util.function.Function;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public static void main(String[] args) {
        Function<Triangle, Double> triangleIntegerFunction = triangle -> {
            double a = triangle.a;
            double b = triangle.b;
            double c = triangle.c;

            double p = (a + b + c) / 2;

            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        };

        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println(triangleIntegerFunction.apply(triangle));


    }
}
