package de.telran.baibak.iryna.homework2.shapes3D;

public class Cube extends Shape3D {

        int length;

        public Cube(int length) {
            this.length = length;
        }

        @Override
        public void volume() {
            super.volume();
            int Volume = length * length * length;
            System.out.printf("Обьем куба %d%n", Volume);
        }
    }


