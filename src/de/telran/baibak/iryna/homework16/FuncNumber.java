package de.telran.baibak.iryna.homework16;

import java.util.function.Function;

public class FuncNumber {
    //Напишите функцию для подсчета квадрата числа и запустите его на числах от 1 до 10
    public static void main(String[] args) {

        Function<Integer, Integer> number = x -> x * x;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(number.apply(i));
        }

    }
}
