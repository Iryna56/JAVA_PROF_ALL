package de.telran.baibak.iryna.homework5.task9;

import java.util.Arrays;

public class SumTwoArrays {
    public static void main(String[] args) {


        int[][] array1 = {{1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}};
        int[][] array2 = {{8, 2, 3},
                {9, 2, 3},
                {5, 2, 3}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                int result = array1[i][j] + array2[i][j];
                System.out.print(result + " ");


            }


        }



            }

        }






