package algorithms_0709;

public class MaxElementInArray {
    /* Найти максимальный элемент в массиве.

Известно, что в таком массиве максимум находится по соседству с меньшими элементами,
т.е. предыдущий и следующий за ним элементы гарантировано меньше искомого.
Пример входного массива: array [0,1,2,3,4,5,10,9,8,7,6]
max = 10;

     */

    public static int search(int[] arr) {
        int leftBorder = 0;
        int rightBorder = arr.length - 1;

        while (leftBorder <= rightBorder) {
            int middleIndex = (leftBorder + rightBorder) / 2;

            if (middleIndex == 0 || arr[middleIndex] > arr[middleIndex - 1] && (middleIndex == arr.length - 1 || arr[middleIndex] > arr[middleIndex + 1]))
                return middleIndex;
            if (arr[middleIndex] > arr[middleIndex + 1]) {
                rightBorder = middleIndex - 1;
            } else {
                leftBorder = middleIndex + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(search(array));
    }
}


