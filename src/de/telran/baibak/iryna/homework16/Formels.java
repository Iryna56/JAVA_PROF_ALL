package de.telran.baibak.iryna.homework16;

import java.util.function.Function;

public class Formels {
    public static void main(String[] args) {

        Function<Integer, Integer> number1 = x -> x * x + 8 * x + 12;

        for (int i = 0; i <= 10; i++) {
            System.out.println(number1.apply(i));
        }

        Function<Integer, Integer> number2 = x -> 5 * x * x + 3 * x + 7;
        for (int i = 0; i <= 10; i++) {
            System.out.println(number2.apply(i));
        }

        Function<Integer, Integer> number3 = x -> x * x + 6 * x + 9;
        for (int i = 0; i <= 10; i++) {
            System.out.println(number3.apply(i));
        }

    }
}
