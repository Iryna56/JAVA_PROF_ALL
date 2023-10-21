package de.telran.baibak.iryna.homework13;

import java.util.Arrays;

public class CheckArrays {
    //Проверьте, равны ли два массива или нет (массивы считаются равными, если содержат одинаковые элементы, порядок не важен)
    public static void main(String[] args) {


        int[] arr1 = {2, 3, 5, 6, 7, 8};
        int[] arr2 = {3, 2, 6, 5, 8, 7};

        System.out.println(checkArray(arr1, arr2));


    }

    public static boolean checkArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
