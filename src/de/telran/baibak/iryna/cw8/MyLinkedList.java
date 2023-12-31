package de.telran.baibak.iryna.cw8;

import java.util.*;

public class MyLinkedList implements List<Integer> {
    private int size;
    private Node first;
    private Node last;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(Integer value) {
        Node current = new Node(value);
        if (!isEmpty()) {
            Node tmp = this.last;
            current.setPrev(tmp);
            tmp.setNext(current);
        } else {
            this.first = current;
        }
        this.last = current;
        this.size++;
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyListIterator(this.first);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    @Override
    public Integer get(int index) {
        return findNodeOnIndex(index).getValue();
    }

    @Override
    public Integer set(int index, Integer newValue) {
        Node nodeOnIndex = findNodeOnIndex(index);
        Integer prevValue = nodeOnIndex.getValue();
        nodeOnIndex.setValue(newValue);
        return prevValue;
    }

    private Node findNodeOnIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        int current = 0;
        Node nodeOnIndex = this.first;
        while (index > current) {
            nodeOnIndex = nodeOnIndex.getNext();
            current++;
        }
        return nodeOnIndex;
    }

    @Override
    public int indexOf(Object o) {
        int current = 0;
        for (Integer val : this) {
            if (Objects.equals(o, val)) {
                return current;
            }
            current++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void add(int index, Integer value) {
        Node nodeOnIndex = findNodeOnIndex(index);
        Node currentNode = new Node(value);
        currentNode.setPrev(nodeOnIndex.getPrev());
        currentNode.setNext(nodeOnIndex);
        nodeOnIndex.getPrev().setNext(currentNode);
        currentNode.getNext().setPrev(currentNode);
    }

    @Override
    public Integer remove(int index) {
        Node nodeToRemove = findNodeOnIndex(index);
        Node prev = nodeToRemove.getPrev();
        Node next = nodeToRemove.getNext();
        if (prev == null) {
            this.first = next;
        } else {
            prev.setNext(next);
        }
        if (next == null) {
            this.last = prev;
        } else {
            next.setPrev(prev);
        }
        size--;
        return nodeToRemove.getValue();
    }

    @Override
    public boolean remove(Object o) {
        int elemIndexToDelete = indexOf(o);
        if (elemIndexToDelete != -1) {
            remove(elemIndexToDelete);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

}











/**
 * Уровень 2 - методы
 *
 * @see this#findNodeOnIndex(int) (int) - сделать поиск с конца, если индекс находится во второй половине списка
 * @see this#descendingIterator() - итератор из конца в начало
 * @see this#listIterator() - итератор с дополнительной сылкой на предыдущий
 * @see this#toArray() - перевести в массив
 * @see this#containsAll(Collection) - проверить содержатся ли все
 * @see this#removeAll(Collection) - удалить все которые содержатся в коллекции
 * @see this#lastIndexOf(Object)  - последний индекс входного элемента (идеально пожходит итератор с конца в начало)
 * Уровень 3
 * @see this#subList(int, int) - вернуть новый майлист который будет обрезан
 * @see this#addAll(int, Collection) - добавить все начиная с какого-то индекса
 * @see this#retainAll(Collection) - удалить все что не содержится во входной коллекции
 */



