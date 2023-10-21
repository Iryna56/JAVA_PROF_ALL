package de.telran.baibak.iryna.homework13;

import java.util.HashMap;

public class SearchElement {
    /*Найти первый элемент, встречающийся k раз в массиве
    * */

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 7, 3, 7, 10, 41};
        int k = 2;

    }

    public static int firstElement(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = 0;

            if (map.get(arr[i]) != null)
                a = map.get(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == k)
                return arr[i];
        }
        return -1;
    }
}
