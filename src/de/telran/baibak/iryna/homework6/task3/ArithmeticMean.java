package de.telran.baibak.iryna.homework6.task3;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ArithmeticMean {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            arrayList.add(scanner.nextInt());

        }
        System.out.println(arrayList);
        arithmeticMean(arrayList);


    }

    public static void arithmeticMean(List<Integer> list) {

    double average = 0;
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i);

        }
        average /= list.size();
        System.out.println(average);

    }



    }


















