package de.telran.baibak.iryna.homework7.task2;

import java.util.Iterator;

public class MyIterator2 implements Iterator<Integer> {
    Integer[] array;
    int index = 0;

    public MyIterator2(Integer[] array) {
        this.array = array;
    }


    @Override
    public boolean hasNext() {

        return index < array.length;
    }

    @Override
    public Integer next() {
        if(!hasNext());
        return array[index++];
    }

}

