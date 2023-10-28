package de.telran.baibak.iryna.homework16;

import java.util.function.Function;

public class LambdaHomework {
    public static void main(String[] args) {

        Function<Integer, Double> formula = x -> (Math.pow(x, 2) / 2) - (2 * x / 3) - (x - 2) / 6;
        System.out.println(formula.apply(5));

        Function<Double, Double> formula1 = x -> Math.pow(x - 1 / x, 0.5) + Math.pow(1 - 1 / x, 0.5);
        System.out.println(formula1.apply(5.0));

        Function<Double, Double> formula2 = x -> Math.sqrt(3 * x - 1) + Math.pow(1 + x, 2);
        System.out.println(formula2.apply(5.0));


    }
}
