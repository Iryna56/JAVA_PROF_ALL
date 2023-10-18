package algorithms_1409;

import java.util.ArrayList;

public class Quicksort {
    /* Разделение массива на деревья с определением опорного элемента

     */
    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }

        array[right] = array[i];
        array[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9, 3};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
