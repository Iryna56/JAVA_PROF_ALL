package de.telran.baibak.iryna.homework2.generator;

import java.util.Random;

public class ShapeGenerator {
    String type;

    public void draw1() {
        System.out.println("Я рисую круг");
    }
    public void draw2() {
        System.out.println("Я рисую квадрат");
    }
    public void draw3() {
        System.out.println("Я рисую треугольник");
    }

    public void generate() {
        Random random = new Random();
        int q = random.nextInt(0, 3);
        if(q == 0) {
            draw1();
        } else if (q == 1) {
            draw2();
        } else {
            draw3();


        }
        {

        }
    }
}
