package de.telran.baibak.iryna.homework5.task3;


public class MaxElement {
    public static void main(String[] args) {


        int[][] array = {
                {76, 94, 35, 48, 56},
                {64, 71, 18, 93, 187},
                {832, 837, 91, 4, 54},
                {97, 952, 67, 3, 187},
                {12, 34, 15, 16, 134}};

        int maxNumber = array[0][0];
        for (int i = 0; i < array.length; i++) {
                if (maxNumber < array[array.length - 1 - i][i]) {
                    maxNumber = array[array.length - 1 - i][i];
                }
            }
            System.out.println(maxNumber);

        }
    }
