package algorithms.homework2;

import java.util.Arrays;

public class Sequence {
    //2, 0, 2/3, 0, 2/5, 0, 2/7, …. - постройте формулу для последовательности.
    //четные элементы ряда имеют значение 0 и оно не изменяется
    //в последовательности нечетных элементов есть закономерность - знаменатель соответствует порядковому номеру в последовательности
    //таким образом формула для нечетных элементов - N = 2/n, где n-индекс
    public static void main(String[] args) {
        float[] arr = new float[10];
        for (int i = 1; i < arr.length; i++) {
            float a = 2;
            if (i % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = a / i;
            }

        }
    }
}
