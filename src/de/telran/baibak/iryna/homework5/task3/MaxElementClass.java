package de.telran.baibak.iryna.homework5.task3;

import java.util.Random;

public class MaxElementClass {
    public static void main(String[] args) {


        int[][] twoDimArray = new int[10][10];
        fillWithandom(twoDimArray);

        int[] ortogonalDiagonal = new int[10];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray.length - i - 1 == j) {
                    ortogonalDiagonal[i] = twoDimArray[i][j];


                }
            }
        }
        int max = ortogonalDiagonal[0];
        for (int i = 0; i < ortogonalDiagonal.length; i++) {
            if(ortogonalDiagonal[i] > max) {
                max = ortogonalDiagonal[i];
            }
            System.out.println(max);

        }
    }
    public static void fillWithandom(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(100);

                }
            
        }
    }

}