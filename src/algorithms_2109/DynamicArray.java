package algorithms_2109;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray {
    private Integer[] array;
    private int lenght;
    private int capacity;


    public DynamicArray() {
        this.array = new Integer[1];
        this.lenght = 0;
        this.capacity = 1;
    }
    public void add(Integer elm) {
        if(this.lenght == this.capacity) {
            this.capacity *= 2;
            this.array = Arrays.copyOf(this.array, this.capacity);
        }
        this.array[lenght++] = elm;
    }

    /*
    0. arr = [] , lenght = 0, capacity = 1
    1. arr = [1] , lenght = 1, capacity = 1  0(1)
    2. arr = [1, 2] , lenght = 2, capacity = 2  0(1) + O(1)
    3. arr = [1, 2, 3, ...] , lenght = 3, capacity = 4  O(2) + O(1)
    ....
    n. arr = [1, 2, 3, ..., n] , lenght = n, capacity = n  O(n) + O(1)

   O(1) * n + (O(1) + O(2) + O(4) + .... + O(n)) = O(n)
    O(n) / n = O(1) один шаг
     */
    /*
    add elm = 1, increase = lenght
    0. arr = [] , lenght = 0, capacity = 1, money = 0
    1. arr = [1] , lenght = 1, capacity = 1, money = 2            -1 +3
    2. arr = [1, 2] , lenght = 2, capacity = 2, money = 3          -2 +3
    3. arr = [1, 2, 3] , lenght = 3, capacity = 4, money = 3,       -3 +3
    4. arr = [1, 2, 3, 4] , lenght = 4, capacity = 4, money = 5      -1 +3
    5. arr = [1, 2, 3, 4, 5] , lenght = 5, capacity = 8, money = 3    -4  +3
    6. arr = [1, 2, 3, 4, 5, 6] , lenght = 6, capacity = 8, money = 5   -1  +3
    7. arr = [1, 2, 3, 4, 5, 6, 7] , lenght = 7, capacity = 8, money = 7   -1  +3
    8. arr = [1, 2, 3, 4, 5, 6, 7, 8] , lenght = 8, capacity = 8, money = 9   -1  +3
    9. arr = [1, 2, 3, 4, 5, 6, 7, 8, 9] , lenght = 9, capacity = 16, money = 3   -9  +3
    ....
    n. arr = [1, 2, 3, ..., n] , lenght = n, capacity = n  O(n) + O(1)

   O(1) * n + (O(1) + O(2) + O(4) + .... + O(n)) = O(n)
    O(n) / n = O(1) один шаг
     */
    public Integer get(int index) {
        if(index < 0 || index >= lenght) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        return this.array[index];
    }
    public void print() {
        get(-1);
        for (Integer i : this.array) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        try {
            dynamicArray.print();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Problem");
        }
//        dynamicArray.print();
    }
}
