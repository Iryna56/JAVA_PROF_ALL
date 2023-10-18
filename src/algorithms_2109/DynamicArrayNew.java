package algorithms_2109;

import java.util.Arrays;

public class DynamicArrayNew {
    /* Создайте структуру DynamicArray
Реализуйте два пути создания:
DynamicArray() - по умолчанию capacity = 1
DynamicArray(capacity) - изначальный массив имеет capacity = capacity

Реализуйте методы:
add(data) - добавляет в конец
remove() - удаляет последний
removeAt(index) - удаляет по индексу
growSize() - увеличивает размер
set(index, data) - изменяет элемент
clean() - удаляет все элементы
contains(data) - проверяет существует ли элемент
isEmpty() - вернет false, если в структуре есть элемент
     */


    private Integer[] array;
    private int lenght;
    private int capacity;

    public DynamicArrayNew() {
        this(1);
    }

    public DynamicArrayNew(int initialCapacity) {
        this.capacity = initialCapacity;
        this.array = new Integer[capacity];
        this.lenght = 0;
    }

    public void add(int data) {
        if (lenght == capacity) {
            growSize();
        }
        array[lenght] = data;
        lenght++;
    }

    public void remove() {
        if (lenght == 0) {
            throw new IndexOutOfBoundsException("Array is empty");
        }
        lenght--;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= lenght) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < lenght - 1; i++) {
            array[i] = array[i + 1];
        }
        lenght--;
    }

    private void growSize() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    public void set(int index, int data) {
        if (index < 0 || index >= lenght) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        array[index] = data;
    }

    public void clean() {
        lenght = 0;
        array = new Integer[capacity];
    }

    public boolean contains(int data) {
        for (int i = 0; i < lenght; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (lenght == 0) {
            return true;
        }
        return false;
    }


}
