package de.telran.baibak.iryna.cw8;

import java.util.Iterator;

public class MyListIterator implements Iterator<Integer> {
    private Node current;
    public MyListIterator(Node current) {
        this.current = current;
    }


    public boolean hasNext(){
        return current != null;
    }


    public Integer next() {
        Integer value = current.getValue();
        current = current.getNext();
        return value;
    }
}

