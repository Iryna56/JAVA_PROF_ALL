package algorithms_1409;

public class MergeSort {
    public static void mergeSort(int[] array, int[] tempArray, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) { // Проверяем базовый случай. То есть смотрим, что к нам пришел пустая область или область из одного элемента
            int middleIndex = (leftIndex + rightIndex) / 2; // Вычисяем середину рассматриваемой области
            mergeSort(array, tempArray, leftIndex, middleIndex);  // Применяем рекурсивно метод к левой области (от левого индекса до середины)
            mergeSort(array, tempArray, middleIndex + 1, rightIndex); // Применяем рекурсивно метод к правой области (от правого индекса до середины)
            merge(array, tempArray, leftIndex, middleIndex, rightIndex); // Объединяем две областив вместе в отсортированном поряде
        }
    }

    public static void mergeSort(int[] array) {
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    public static void merge(int[] array, int[] tempArray, int leftIndex, int middleIndex, int rightIndex) {
        for (int i = leftIndex; i <= rightIndex; i++) {
            tempArray[i] = array[i]; // Перенести область из array, которая начинается с leftIndex и заканчивается rightIndex, в tempArray
        }

        int i = leftIndex, j = middleIndex + 1, k = leftIndex; //  создаем индексы для работы с левой (i) и правой (j) частью временного массива, а также индекс для работы с нашим реальным массивом (k)

        while (i <= middleIndex && j <= rightIndex) {
            if (tempArray[i] <= tempArray[j]) { // Проверяем какой элемент меньше из левой области временного массива или из правой
                array[k] = tempArray[i]; // кладем в реальный массив на место элемента по индексу  k элемент из левой области по индексу i
                i++; // переходим к следующему элементу в левой области временного массива
            } else {
                array[k] = tempArray[j];// кладем в реальный массив на место элемента по индексу  k элемент из правой области по индексу j
                j++; // переходим к следующему элементу в правой области временного массива
            }
            k++; // переходим к следующему элементу в реального массива
        }

        while (i <= middleIndex) { //заполнение реального массива элементами из левой части на случай если они остались (если остались элементы только из правой части, то их заполнять не нужно, они изначально в реальном массиве были на своих местах)
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7}; // Инициализация массива
        mergeSort(array); // Сортировка слиянием
        for (int number : array) {
            System.out.print(number + " "); // Вывод ответа
        }
    }
}
