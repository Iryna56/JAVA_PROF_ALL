package de.telran.baibak.iryna.homework8.task1;


public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Integer[] array;
    private int size;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int initialCapacity) {
        array = new Integer[initialCapacity];
        size = 0;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return array[index];
    }

    public Integer set(int index, Integer element) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Integer oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

    public void add(Integer element) {
        if (size == array.length) {
            expandCapacity();
        }
        array[size] = element;
        size++;
    }
    private void expandCapacity() {
        int newCapacity = array.length * 2;
        Integer[] newArray = new Integer[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }


    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList.size);
    }








}